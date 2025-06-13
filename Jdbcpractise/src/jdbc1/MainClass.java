package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass {
public static void main(String[] args) {
	
	try {
	
		
		// 1. Load the driver using the forName () method. 
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded Successfully");
		
		
		String url = "jdbc:mysql://localhost:3306/my_data";
		String dbName = "root";
		String password = "root";
		
		//2.Register the driver in DriverManager and Create the Connection
	     Connection con =  DriverManager.getConnection(url ,dbName ,password);
	    System.out.println("Connection Established Successfully");
	    
	    //3. Create Statement
	    Statement stmp =  con.createStatement();
	    System.out.println("Statement Created Successfully");
	    
	  //  String query = "UPDATE employe  set name = 'Tab 9'  WHERE id = 2;";
	    String query2 = "INSERT INTO EMPLOYE(name , hire_date) VALUES('Abishek Yadav','2021-10-01')";
	    //4. Execute Query
	    boolean rowEffect =   stmp.execute(query2);
	   
	  System.out.println(rowEffect);
	    
	    //5. Close Connection
	    stmp.close();
	    con.close();
	
	    
	      
		
	} catch (ClassNotFoundException  | SQLException e) {

		e.printStackTrace();
	}
}
		
}
