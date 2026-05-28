package bhuvi;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateEmployeeServlet extends GenericServlet {
	public UpdateDAO ob = null;

	public void init() throws ServletException {
		ob = new UpdateDAO();
	}

	public void service(ServletRequest req,ServletResponse res)throws
   ServletException,IOException{
int k = ob.update(req);
PrintWriter pw = res.getWriter();
res.setContentType("text/html");
if(k>0) {
pw.println("Employee Updated Successfully...<br>");

RequestDispatcher rd = req.getRequestDispatcher("update.html");
rd.include(req, res);
}
   }

	public void destroy() {
		ob = null;
	}
}
