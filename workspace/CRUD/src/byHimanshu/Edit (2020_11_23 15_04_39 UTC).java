package byHimanshu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int ide=Integer.parseInt(request.getParameter("id"));
		Employee e=EmployeeDao.getbyId(ide);
		
		out.println("<form action='Edit2' method='post'>");
		out.println("<table>");

		out.println("<tr><td>Id </td><td><input type='hidden' name='id' value='"+e.getId()+"'></td></tr>");
		out.println("<tr><td>Name </td><td><input type='text' name='name' value='"+e.getName()+"'></td></tr>");
		out.println("<tr><td>Password </td><td><input type='password' name='password' value='"+e.getPassword()+"'></td></tr>");
		out.println("<tr><td>Email </td><td><input type='email' name='email' value='"+e.getEmail()+"'></td></tr>");
		out.println("<tr><td>Country </td><td><select name='country' style='width:150px'>");

		out.println("<option>India</option>");
		out.println("<option>Russia</option>");
		out.println("<option>UK</option>");
		out.println("<option>China</option>");
		out.println("<option>USA</option>");
		out.println("</select></td></tr>");

		out.println("<tr><td><input type='submit' value='update & save'></td></tr>");
		out.println("</table>");
		out.println("</form>");
	}

}
