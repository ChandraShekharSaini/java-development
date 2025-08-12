package Practise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainClass {
 
	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost:3306/my_data";
			String username  ="root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
			
			Connection con = DriverManager.getConnection(url , username , password);
			
			System.out.println("Loaded");
			
			Statement stmp = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , 0);
			
			
			
	        //String query = "INSERT INTO EMPLOYE(name,hire_date) VALUES('Rama ','2020-12-02')";
	        String query = "SELECT * FROM employe";
		
	       ResultSet result =   stmp.executeQuery(query);
	       
	 
	      while(result.next()) {    
	      System.out.println(result.getInt(1) +" | "+ result.getString(2)+" | "+result.getString(3));

	       }
	      
	      if(result.absolute(2)) {
		      System.out.println(result.getInt(1) +" | "+ result.getString(2)+" | "+result.getString(3));
	      }
	     System.out.println("--------------------------");
	      if(result.first()) {
	    	  System.out.println(result.getInt(1) +" | "+ result.getString(2)+" | "+result.getString(3));
	      }
	      
	      
	    String seleQuery1  = "INSERT INTO EMPLOYE(name , hire_date) VALUES('jiji A','2090-12-23')";
	    String seleQuery2  = "INSERT INTO EMPLOYE(name , hire_date) VALUES('jiji B','2090-12-23')";
	    String seleQuery3  = "INSERT INTO EMPLOYE(name , hire_date) VALUES('jiji C','2090-12-23')";
	    
	    stmp.addBatch(seleQuery1);
	    stmp.addBatch(seleQuery2);
	    stmp.addBatch(seleQuery3);

		int[] updated = stmp.executeBatch();
		
		for(int x:updated) {
			System.out.println(x);
		}
		
		con.close();
		stmp.close();
			
			
			
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
