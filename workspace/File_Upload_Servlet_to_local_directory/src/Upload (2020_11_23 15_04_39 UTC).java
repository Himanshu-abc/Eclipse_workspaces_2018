import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

@WebServlet(name = "Upload1", urlPatterns = { "/Upload1" })
public class Upload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/length");
		PrintWriter out=response.getWriter();
		
		MultipartRequest m=new MultipartRequest(request, "e:/localupload");
		out.println("successfully upload");
	}
}
