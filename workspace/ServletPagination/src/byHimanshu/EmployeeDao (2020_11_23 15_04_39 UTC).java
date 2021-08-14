package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Connection con=null;
		
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		
			Class.forName("com.mysql.jdbc.Driver");
			
			con=DriverManager.getConnection(url, user, password);
			
		return con;
	}
	
	public static List<Employee> fetch(int start,int total){
		
		List<Employee> li=new ArrayList<Employee>();
		
		try {
			Connection conn=EmployeeDao.getConnection();
			
			PreparedStatement pst=conn.prepareStatement("Select * from emp limit "+(start-1)+","+total);
			
			ResultSet rs=pst.executeQuery();
			
			while(rs.next()) {
			
				Employee ee=new Employee();
				
				ee.setId(rs.getInt(1));
				ee.setName(rs.getString(2));
				ee.setSalary(rs.getFloat(3));
	
				li.add(ee);
			}
			conn.close();
			
		}catch (Exception e) {
		e.printStackTrace();	
		}
		return li;
	}
}