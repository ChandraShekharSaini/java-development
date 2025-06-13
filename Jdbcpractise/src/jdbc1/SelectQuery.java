package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		
		
		try {
			
			String url =  "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    Connection con = 	DriverManager.getConnection(url , username , password);
		
		    Statement stmp  = con.createStatement();
		
		
	        String  query = "Select * From employe";
	  
	        ResultSet result =  stmp.executeQuery(query);
	        
	        
	             
	        while(result.next()) {
	         //  System.out.println(result.getInt(1) + " | "+ result.getString(2) +" | "+ result.getString(3));
	            
	         //   System.out.println(result.getInt(0)); //Erorr
	        	
	        	System.out.println(result.getInt("id") +" | "+ result.getString("name") + " | "+ result.getString("hire_date"));
	        }
	  
		result.close();
		con.close();
		stmp.close();
			
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
