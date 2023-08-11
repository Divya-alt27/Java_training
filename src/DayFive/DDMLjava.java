package DayFive;
import java.sql.*;
public class DDMLjava {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Kartdi@93");
		Statement stmt=con.createStatement();
		/*String createQuery="create table registration(id integer,firstname varchar(30),asttname varchar(30),gender varchar(2), age integer)";
		int ret=stmt.executeUpdate(createQuery);		
		System.out.println(ret);*/
		
		String updtQuery="update employee set salary=50000;";
		int ret=stmt.executeUpdate(updtQuery);
		System.out.println(ret);
		
	}

}
