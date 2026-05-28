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
@WebServlet("/add")
public class AddEmployeeServlet extends GenericServlet {
	public EmployeeBean eb = null;
	public InserTDAO ob = null;

	public void init() throws ServletException {
		eb = new EmployeeBean();
		ob = new InserTDAO();
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		eb.setId(req.getParameter("id"));
		eb.setName(req.getParameter("name"));
		eb.setDesg(req.getParameter("desg"));
		eb.setbSal(Integer.parseInt(req.getParameter("bSal")));
		eb.settotSal(eb.gettotSal() + (0.93F * eb.getbSal()) + (0.63F * eb.getbSal()));
		int k = ob.insert(eb);
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		if (k > 0) {
			pw.println("Employee Added Successfully...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("update.html");
			rd.include(req, res);
		}
	}

	public void destroy() {
		ob = null;
		eb = null;
	}
}