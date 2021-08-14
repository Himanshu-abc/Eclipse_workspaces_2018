package byHimanshu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Photo")
public class Photo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("image/jpeg");
		
		String fpath="E:\\memory card\\captions,images\\";
		String fname="sly.jpg";
		
		FileInputStream fin=new FileInputStream(fpath+fname);
		ServletOutputStream sout=response.getOutputStream();
		
		BufferedInputStream bin=new BufferedInputStream(fin);
		BufferedOutputStream bout=new BufferedOutputStream(sout);
		
		int i;
		while((i=bin.read())!=-1) {
			bout.write(i);
		}
		bin.close();
	}
}
