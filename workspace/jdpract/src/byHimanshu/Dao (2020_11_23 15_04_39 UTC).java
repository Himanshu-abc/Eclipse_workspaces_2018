package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Dao {

	public static Connection getConnection() {
		
		String Driver="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String password="apocalypse";
		
		Connection con=null;
		
		try {
			
		Class.forName(Driver);
		
		con=DriverManager.getConnection(url, user, password);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static int save(Employee ee) {
		
		int status=0;
		
		try {
			
			Connection con=Dao.getConnection();
			
			PreparedStatement pst =con.prepareStatement("insert into user905 (name,password,email,country) values (?,?,?,?)");
			
			pst.setString(1, ee.getName());
			pst.setString(2, ee.getPassword());
			pst.setString(3, ee.getEmail());
			pst.setString(4, ee.getCountry());
			
			status=pst.executeUpdate();
			
			pst.close();
			con.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		return status;
	}
}
