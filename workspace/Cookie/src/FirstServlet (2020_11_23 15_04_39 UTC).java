

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	   
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   
	   request.getRequestDispatcher("link.html").include(request, response);
	   
	   String uname=request.getParameter("uname");
	   String pwd=request.getParameter("password");
	   
	   if(pwd.equals("abc123")) {
		  
		   out.println("welcome "+uname);
		   
		   Cookie ck=new  Cookie("c1", uname);
		   response.addCookie(ck);
	   }
	   else {
		   
		   out.println("sorry wrong password try again");
		   request.getRequestDispatcher("login.html").include(request, response);
		   
	   }
   }
}
