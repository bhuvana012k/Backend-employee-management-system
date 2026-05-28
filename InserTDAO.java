package bhuvi;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class InserTDAO {

	public int k=0;
	 public int insert(EmployeeBean eb) {
		 try {
		  Connection con = DBCOnnection.getCon();//Accessing 
	
		  PreparedStatement ps = con.prepareStatement
		  ("insert into Employees values(?,?,?,?,?)");
		
		 ps.setString(1,eb.getId());
		 ps.setString(2,eb.getName());
		 ps.setString(3,eb.getDesg());
		 ps.setInt(4,eb.getbSal());
		 ps.setFloat(5, eb.gettotSal());
		k = ps.executeUpdate();
		  }catch(Exception e) {e.printStackTrace();}
		 return k;
}
}

