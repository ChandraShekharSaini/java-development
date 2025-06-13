package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteClass {

	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username ="root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		     Connection con =	DriverManager.getConnection(url , username , password);
		     
		     Statement stmp = con.createStatement();
		     
		     
		     String query  = "DELETE FROM EMPLOYE WHERE ID = 3";
		     
		     int status =  stmp.executeUpdate(query);
		     
		     
		    
		     if(status>0) {
		    	 System.out.println("Deleted Successfully");
		    	 
		    	 
		     }else {
		    	 System.out.println("Deletion Fail");
		     }
		     		
			
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
