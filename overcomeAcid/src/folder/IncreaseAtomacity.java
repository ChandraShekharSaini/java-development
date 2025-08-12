package folder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class IncreaseAtomacity {

		public static void main(String[] args) {
			
			try {
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String username = "root";
				String password = "root";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		        Connection con = DriverManager.getConnection(url , username , password);
		        
		        String query = "SELECT * FROM bank WHERE  account_no = ? AND balance = ?";
		
		        PreparedStatement stmp = con.prepareStatement(query);
		       
		       Scanner sc=  new Scanner(System.in);
		 
		       
	   	   
		    	    System.out.print("Enter account:");
		 	        int account = sc.nextInt();
		 	        
		 		    System.out.print("Enter balance:");
		 	        int balance = sc.nextInt();
		 	        
		 	        stmp.setInt(1, account);
		 	        stmp.setInt(2, balance);
		 	        
		 	        ResultSet result =    stmp.executeQuery();
		 	        
		 	        
		 	      
		 	       if(result.next()) {
		 	    	   System.out.println(result.getString("name") +" account balance is:"+result.getInt("balance"));
		 	       }else {
		 	    	   
		 	    	   System.out.println("Invalid Request");
		 	       }
		 	
		        
		 	       	System.out.println("Transfer Details....");
		 	       	System.out.print("Enter receiver account no:");
		 	       	int account_n= sc.nextInt();
		 	       	System.out.print("Enter blance you want to transfer:");
		 	       	int balance_n = sc.nextInt();
		 	       	
		 	       	String query1 = "UPDATE BANK SET BALANCE=BALANCE+? WHERE account_no = ?";
		 	       	
		 	        PreparedStatement 	stmp1 =    con.prepareStatement(query1);
		 	        
		 	        stmp1.setInt(1, balance_n);
		 	        stmp1.setInt(2, account_n);
		             
		 	       int result1 =    stmp1.executeUpdate();
		 	       
		 	       if(result1>0) {
		 	    	   System.out.println("----------------------------------------------");
		 	    	   System.out.println("Balanceed Transferred Succesfully.....");
		 	    	   
		 	    	   String query3 = "SELECT * FROM bank WHERE account_no = ?";
		 	    	   
		 	    	   PreparedStatement stmp2 = con.prepareStatement(query3);
		 	    	   stmp2.setInt(1,account_n);
		 	    	   
		 	    	 ResultSet receiver_d =   stmp2.executeQuery();
		 	    	 
		 	    	 
		 	    	  if(receiver_d.next()) {
		 	    		  System.out.println("Balace Details of:" +receiver_d.getString("name"));
		 	    		  System.out.println("Account No:" +receiver_d.getInt("account_no"));
		 	   		      System.out.println("Current Balance:" +receiver_d.getInt("balance"));
		 	    	  }
		 	       }
		 	    
		 	    
		 	        
				
			}
			catch(Exception x) {
				x.printStackTrace();		}
		}

	

}
