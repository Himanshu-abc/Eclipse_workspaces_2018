

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		
		try {
			
			String name=request.getParameter("uname");
			String password=request.getParameter("password");
			
			Class.forName("orcale.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
			
			PreparedStatement pst=con.prepareStatement("select name from emp22 where name=? and pass=?");
			
			pst.setString(1, name);
			pst.setString(2, password);
			
			boolean b=pst.execute();
			
			if(b) {
				out.println("successfully logged in");
				
				HttpSession session=request.getSession();
				session.setAttribute("s1",name);
				
				out.println("<a href='Second'>Second</a>");
			}
			else {
				
			  out.println("buddy you entered a wrong password");
			  request.getRequestDispatcher("index.html").include(request, response);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
