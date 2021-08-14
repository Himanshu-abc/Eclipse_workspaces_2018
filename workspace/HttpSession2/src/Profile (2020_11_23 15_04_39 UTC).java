import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession sess=request.getSession(false);
		
		if(sess!=null) {
			
			String name=(String) sess.getAttribute("s1");
			out.println("welcome "+name);
		}
		else {
		     
			out.println("hey buddy you are not into session get yourself int sesssion");
			request.getRequestDispatcher("login.html").include(request, response);
			
		}
	}
}