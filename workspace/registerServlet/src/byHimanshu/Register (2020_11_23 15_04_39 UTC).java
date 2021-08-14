package byHimanshu;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String u = request.getParameter("name");
		String p =request.getParameter("password");
		String e=request.getParameter("email");
		String c=request.getParameter("country");
		
		out.print("outside");
		
		try {
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="system";
			String passwor="apocalypse";
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con=DriverManager.getConnection(url, user, passwor);
			
			PreparedStatement pst=con.prepareStatement("insert into registeruser values (?,?,?,?)");
			
			pst.setString(1, u);
			pst.setString(2, p);
			pst.setString(3, e);
			pst.setString(4, c);
			
			int i=pst.executeUpdate();
			
			if(i>0) {
				out.println("data successfully entered into table");
			}
			else {
				out.println("Some error");
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		out.close();
	}
}