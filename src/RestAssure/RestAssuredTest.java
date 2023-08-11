package RestAssure;

import static org.junit.Assert.*;

import java.util.List;

import io.restassured.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import org.junit.Test;

public class RestAssuredTest {

	/**
	 * 
	 */

	public void verifyPostAPI()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		String body="{\"title\":\"abc\",\"body\":\"far\",\"userid\":\"1\"}";
		Response rep=RestAssured.given().body(body).post("/posts").then().extract().response();
		System.out.println("status code"+rep.getStatusCode());
		ResponseBody respbody=rep.body();
		JsonPath jspath=respbody.jsonPath();
		System.out.println(jspath.getInt("id"));
				}
	
	
	//@Test
	public void genderFetchAPI() {
		
		RestAssured.baseURI="https://api.genderize.io/";
		RequestSpecification myreq=RestAssured.given();
		myreq.queryParam("name","Divya");
		Response response=myreq.get();
		System.out.println("String is "+response.toString());
		
	}
	public void verifypositiveauth(String username,String password)
	{
		RestAssured.baseURI="https://postman-echo.com/";
		Response response=RestAssured.given().auth().preemptive().basic(username,password).get("/basic-auth").then().extract().response();
		
		ResponseBody respBody = response.body();
		JsonPath resPath=respBody.jsonPath();
		assertEquals(true,resPath.getBoolean("authenticated"));
		
	}
	public void verifynegativeauth(String username,String password)
	{
		RestAssured.baseURI="https://postman-echo.com/";
		int StatusCode=RestAssured.given().auth().preemptive().basic(username,password).get("/basic-auth").then().extract().response().getStatusCode();
		assertEquals(401,StatusCode);		
	}
	public void countrycount(String state)
	{
		RestAssured.baseURI="http://universities.hipolabs.com";
		Response response=RestAssured.given().queryParam("country","india").get("/search").then().extract().response();
		assertEquals(200,response.getStatusCode());
		//assertEquals("HTTP1.1 200 OK",response.getStatusLine());
		ResponseBody respBody = response.body();
		JsonPath resPath=respBody.jsonPath();
		List<String> statelist=resPath.getList("state-province");
		int val=0;
		 for(int i=0;i<statelist.size();i++)
		 {
			 if(statelist.get(i)!=null)
			 {
				 if(statelist.get(i).equals(state))
				 {
					 val++;
				 }
			 }
			
		 }
		System.out.println("Counter is"+val);
		
	}
	public void checkUniversityExist(String Unv)
	{
		RestAssured.baseURI="http://universities.hipolabs.com";
		Response response=RestAssured.given().queryParam("country","india").get("/search").then().extract().response();
		assertEquals(200,response.getStatusCode());
		assertEquals("HTTP1.1 200 OK",response.getStatusLine());
		ResponseBody respBody = response.body();
		JsonPath resPath=respBody.jsonPath();
		List<String> unvlist=resPath.getList("state-province");
		boolean found=false;
		for(int i=0;i<unvlist.size();i++)
		{
		if(unvlist.get(i)!=null)
		{
			if(unvlist.get(i).equals("university"))
			{
				found=true;
				break;
			}
		}
		}
		if(found)
			System.out.println("Given University is found");
		else
			System.out.println("Given University is not found");
	}
	
	@Test
	public void universityTest()
	{
		//verifypositiveauth("postman","password");
		//verifynegativeauth("done","done");
		//countrycount("Karntaka");
		//checkUniversityExist("AISECT University");
		verifyPostAPI();
	}
	
	

}
