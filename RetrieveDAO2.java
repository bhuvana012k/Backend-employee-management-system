package bhuvi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletRequest;

public class RetrieveDAO2 {
	 public EmployeeBean eb=null;
	 public EmployeeBean retrieve(ServletRequest req) {
		   try {
		   Connection con = DBCOnnection.getCon();
		   PreparedStatement ps = con.prepareStatement
		   ("select * from Employees where id=?");
		   ps.setString(1, req.getParameter("id"));
		   ResultSet rs = ps.executeQuery();
		   if(rs.next()) {
		   eb = new EmployeeBean();//Bean object
		   eb.setId(rs.getString(1));
		   eb.setName(rs.getString(2));
		   eb.setDesg(rs.getString(3));
		   eb.setbSal(rs.getInt(4));
		   eb.settotSal(rs.getFloat(5));
		   }
		   }catch(Exception e) {e.printStackTrace();}
		   return eb;
		       }
		 }


