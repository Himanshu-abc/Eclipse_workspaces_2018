package byHimanshu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewAll")
public class ViewAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	
		List<Employee> li=EmployeeDao.getAll();
		
		out.println("<a href='index.html'>Add Employee</a>");
		out.println("<h3>Employees List</h3>");
		out.println("<table border='1' width='100%'>");
		
		out.println("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Employee ee:li) {
		
		out.println("<tr><td> "+ee.getId()+" </td> <td> "+ee.getName()+" </td> <td> "+ee.getPassword()+" </td> <td> "+ee.getEmail()+" </td> <td> "+ee.getCountry()+" </td> <td><a href='Edit?id="+ee.getId()+"'>edit</a></td>  <td><a href='Delete?id="+ee.getId()+"'>delete</a></td></tr>");	

		}
		out.println("</table>");
	}
}
