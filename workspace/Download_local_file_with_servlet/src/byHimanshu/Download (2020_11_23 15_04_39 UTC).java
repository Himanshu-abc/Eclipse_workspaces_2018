package byHimanshu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Download")
public class Download extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		response.setContentType("APPLICATION/OCTET-STREAM");
		
		String filename="home.jsp";
		String path="E:\\";
		
		response.setHeader("content-Disposition","attachment;filename=\""+filename+"\"");
		
		FileInputStream fin=new FileInputStream(path+filename);
		
		int r;
		while((r=fin.read())!=-1) {
			out.write(r);
		}
		
		fin.close();
		out.close();
	}
}
