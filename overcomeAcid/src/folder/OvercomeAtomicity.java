package folder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class OvercomeAtomicity {

	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        Connection con = DriverManager.getConnection(url , username , password);
	        
	        String query = "INSERT INTO EMPLOYE(name , hire_date)  VALUES(?,?)";
	
	        PreparedStatement stmp = con.prepareStatement(query);
	       
	       Scanner sc=  new Scanner(System.in);
	       System.out.println("Enter no of records:");
	       int n = sc.nextInt();
	       
	       while(n>0) {
//             1. optional, it's true by default
//	    	   When auto-commit is true (default mode), every SQL statement is executed and committed immediately after execution.
//	    	   You don't need to explicitly call con.commit().
//	    	   con.setAutoCommit(true);
	    
	    	   
//	    	   2. if you set false
//	    	   if you want to accumulate (group) multiple SQL operations into one transaction, then you should:
//	    	    con.setAutoCommit(false);
	    	   
	    	   
	    	   con.setAutoCommit(true);
	    	   
	    	    System.out.print("Enter name");
	 	        String name = sc.next();
	 	        
	 		    System.out.print("Enter hire_date");
	 	        String date = sc.next();
	 	        
	 	        stmp.setString(1, name);
	 	        stmp.setString(2, date);
	 	        
	 	        stmp.execute();
	 	       
	 	       n--;
	       }
	       
	       //use con.commit() , if you use  con.setAutoCommit(false);
	       con.commit();
			
		}
		catch(Exception x) {
			x.printStackTrace();		}
	}

}
