package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dcoder {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			/*Class.forName("com.mysql.jdbc.Driver");*/
			
			System.out.println("hello");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","apocalypse");
			
			System.out.println(con);
			/*Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/amit", "root","root");*/
			
			PreparedStatement pst=con.prepareStatement("select * from help"); 
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
			}
			
			System.out.println("connection established");
			/*while(rs.next()) {
				
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4));
			}*/
			
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
