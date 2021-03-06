package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
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
	
	public static int save(Employee e) {
		
		int status=0;
		
		try {
			
		Connection con=EmployeeDao.getConnection();
		  
		PreparedStatement pst =con.prepareStatement("insert into user905 (name,password,email,country) values (?,?,?,?)");
		
		pst.setString(1, e.getName());
		pst.setString(2, e.getPassword());
		pst.setString(3, e.getEmail());
		pst.setString(4, e.getCountry());
		
	    status=pst.executeUpdate();
	   
	    pst.close();
	    con.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return status;
	}
	
	public static List<Employee> getAll(){

		
		List<Employee> el=new ArrayList<Employee>();
		
		try {
			
			Connection con=EmployeeDao.getConnection();
			
			PreparedStatement pst=con.prepareStatement("Select * from user905");
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				Employee ee=new Employee();
				
				ee.setId(rs.getInt(1));
				ee.setName(rs.getString(2));
				ee.setPassword(rs.getString(3));
				ee.setEmail(rs.getString(4));
				ee.setCountry(rs.getString(5));
				
				el.add(ee);
			}
			rs.close();
			con.close();
			
		}catch (Exception e) {
		e.printStackTrace();
		}
		return el;
	}

    public static Employee getbyId(int i){
    
    	Employee e=new Employee();
    	
    	try {
    		
    		Connection con=EmployeeDao.getConnection();
    		
    		PreparedStatement pst=con.prepareStatement(" select * from user905 where id=? ");
    		pst.setInt(1, i);
    		
    		ResultSet rs=pst.executeQuery();
    		
    		if(rs.next()) {
    			
    			e.setId(rs.getInt(1));
    			e.setName(rs.getString(2));
    			e.setPassword(rs.getString(3));
    			e.setEmail(rs.getString(4));
    			e.setCountry(rs.getString(5));
    		}
    		con.close();
    		
    	}catch (Exception ex) {
            ex.printStackTrace();
		}
    	return e;
    }

    public static int update(Employee e) {
    
    	int status=0;
    	try {
    		Connection con=EmployeeDao.getConnection();
    		
    		PreparedStatement pst=con.prepareStatement("Update user905 set name=?,password=?,email=?,country=? where id=?");
    		
    		pst.setString(1, e.getName());
    		pst.setString(2, e.getPassword());
    		pst.setString(3, e.getEmail());
    		pst.setString(4, e.getCountry());
    		pst.setInt(5, e.getId());
    		
    		status=pst.executeUpdate();
    		
    		con.close();
    		
    	}catch (Exception ex) {
		ex.printStackTrace();
		}
    	return status;
    }

    public static int delete(int i) {
    	
    	int status=0;
    	
    	try {
    		
    		Connection con=EmployeeDao.getConnection();
    		
    		PreparedStatement pst=con.prepareStatement("delete from user905 where id=?");
    		
    		pst.setInt(1, i);
    		
    		status=pst.executeUpdate();
    		
    		con.close();
    	}catch (Exception e) {
	        e.printStackTrace();
		}
    	return status;
    }
}
