package jdbc1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class FirstLastRow {
  
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String  password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url ,username , password);
			
			Statement stmp = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , 0);
			
			String query = "SELECT * FROM EMPLOYE";
			
			ResultSet res =  stmp.executeQuery(query);
			
			//For Only First Row
		    if(res.first())
		    {
				System.out.println(res.getInt("id") + " | "+ res.getString("name") +" | "+ res.getString("hire_date"));

		    }
		    
		    //For Only Last Row
		    if(res.last())
		    {
				System.out.println(res.getInt("id") + " | "+ res.getString("name") +" | "+ res.getString("hire_date"));

		    }
		    
		    res.afterLast();
		    res.beforeFirst();
		    
		    
		    res.first();
		   System.out.println(res.getRow());
		   
		   
		   res.last();
		   System.out.println(res.getRow());
		   
		   
		   res.absolute(4);
		   System.out.println(res.getRow());
		   
		   
		    

			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
