package ThirdDay;

public class ExceptionHandling {

	public static void main(String[] args) {
int a=10,b=0;
int arr[]= {10,20,20};
		try
		{// TODO Auto-generated method stub
			//System.out.println(a/b);
			System.out.println(arr[7]);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		
System.out.println("my program finished");
	}

}
