package bhuvi;


import java.sql.Connection;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletRequest;

public class UpdateDAO {

	public int k = 0;

	public int update(ServletRequest req) {
	 try {
	 Connection con = DBCOnnection.getCon();
	 PreparedStatement ps = con.prepareStatement
	 ("update Employees set desg=?,bSal=?,totSal=? where id=?");
	 ps.setString(1,req.getParameter("desg"));
	 int bS = Integer.parseInt(req.getParameter("bSal"));
	 ps.setInt(2,bS);
	 float totSal = bS+(0.93F*bS)+(0.63F*bS);
	 ps.setFloat(3,totSal);
	 ps.setString(4,req.getParameter("id"));
	
	k = ps.executeUpdate();
	 }catch(Exception e) {e.printStackTrace();}
	 return k;
	    }
}


