package byHimanshu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dcoder {

	public static void main(String[] args) {
		
		 String name="john";
		 String password="cena";
		 String email="john_cena@email.com";
		 String country="america";
		 
		 /*String url="jdbc:oracle:thin:@localhost:1521:xe";*/
		 
		 Employee e=new Employee();
		 
		 e.setName(name);
		 e.setPassword(password);
		 e.setEmail(email);
		 e.setCountry(country);
		 
		 try {
			 
			 /*Class.forName("oracle.jdbc.OracleDriver");
			 
			 Connection con=DriverManager.getConnection(url,"system","apocalypse");*/
			 
			 /*Connection con=Dao.getConnection();
			 
			 PreparedStatement pst=con.prepareStatement("insert into user905 (name,password,email,country) values (?,?,?,?)");
			 
			 pst.setString(1, e.getName());
			 pst.setString(2, e.getPassword());
			 pst.setString(3, e.getEmail());
			 pst.setString(4, e.getCountry());
			 
			 int res=pst.executeUpdate();*/
			 
			 int res=Dao.save(e);
			 
			 if(res>0) {
				 System.out.println(res+" rows updated");
			 }
			 
			 /*PreparedStatement pst=con.prepareStatement("Select * from user905");
			 
			 ResultSet rs=pst.executeQuery();
			 
			 while(rs.next()) {
				 
				 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			 }*/
			 
			 /*pst.close();
			 con.close();*/
			 
		 }catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
