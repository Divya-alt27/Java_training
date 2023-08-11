package fouthDay;
import java.sql.*;

public class MySQLExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Kartdi@93");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee where salary>=25000");
//System.out.println(rs.next());
while(rs.next())
{
	System.out.println(rs.getInt(1)+ "  " +rs.getString(2) + "  " + rs.getString(3));
}
con.close();
}
	}


