package byHimanshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String u=request.getParameter("name");
		String p=request.getParameter("password");
		
		boolean result=LoginDao.validate(u,p);
		
		if(result) {
			
			request.getRequestDispatcher("Welcome").forward(request, response);
		}
		else {
			out.println("wrong username or Password");
			request.getRequestDispatcher("index.html").include(request, response);
		}
	}
}
