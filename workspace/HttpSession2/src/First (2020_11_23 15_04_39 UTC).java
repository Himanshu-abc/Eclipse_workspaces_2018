

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/First")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		
		if(password.equals("abc123")) {
		
			out.println("welcome "+uname);
			
			HttpSession session=request.getSession();
			session.setAttribute("s1", uname);
		}
		else {
			out.println("sorry buddy you entered a wrong password");
			
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}
}
