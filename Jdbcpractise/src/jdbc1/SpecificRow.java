package jdbc1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class SpecificRow {
 
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url , username,password);
			
			Statement stmp = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,0);
			
			String query = "SELECT * FROM employe";
			
		    ResultSet res = stmp.executeQuery(query);
		    
		   if(res.absolute(2)) {
			    System.out.println(res.getInt("id") + " | "+ res.getString("name") + " | "+res.getString("hire_date"));
		   }else {
			   System.out.println("Row Not Present");
		   }
	
		  
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
