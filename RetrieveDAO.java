package bhuvi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RetrieveDAO {
	public ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();

	public ArrayList<EmployeeBean> retrieve() {
		try {

			Connection con = DBCOnnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Employees");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				EmployeeBean eb = new EmployeeBean();// Bean object
				eb.setId(rs.getString(1));
				eb.setName(rs.getString(2));
				eb.setDesg(rs.getString(3));
				eb.setbSal(rs.getInt(4));
				eb.settotSal(rs.getFloat(5));
				al.add(eb);// Adding bean to ArrayList
			} // end of loop
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}

