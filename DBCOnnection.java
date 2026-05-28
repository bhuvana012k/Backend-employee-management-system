package bhuvi;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBCOnnection {
	
	
	private static Connection con=null;
	 private DBCOnnection() {}
	 static
	     {
	 try{
	 Class.forName("oracle.jdbc.driver.OracleDriver"); 
	con = DriverManager.getConnection
	 ("jdbc:oracle:thin:@localhost:1521:xe","demo","bhuvana@12"); 
	 }catch(Exception e) {e.printStackTrace();}
	     }
	 public static Connection getCon() {
	 return con;
	     }
	 

}

