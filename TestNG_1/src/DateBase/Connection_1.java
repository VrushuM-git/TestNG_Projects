package DateBase;

import java.sql.DriverManager;
import java.sql.SQLException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import java.sql.Connection;

public class Connection_1 {
	Connection conn = null;
	String DbURL = "jdbc:mysql://localhost:3306/";
	String uname = "root";
	String pass = "";

	@Test
	public void Connection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DbURL,uname,pass);
			System.out.println("connected");  
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("not connected"); 
		}
	}
	@AfterTest
	public void tearDown() throws SQLException{
		if (conn !=null){
			conn.close();
		}
	}
}
