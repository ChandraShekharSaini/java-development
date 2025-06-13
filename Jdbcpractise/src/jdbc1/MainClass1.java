package jdbc1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass1 {

	public static void main(String[] args) {
		
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			//1. Load the Driver using forName method of class Class
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			//2. Register the Driver and create Connection
			Connection con =   DriverManager.getConnection(url , username , password);
			
			//3. Create Statement
			  Statement stmp =  con.createStatement();
			
			///4. Execute Query
		     String query1 = "INSERT INTO EMPLOYE(name , hire_date) VALUES('Baba RamDev','2024-01-22')";
		     String query2 = "UPDATE EMPLOYE SET NAME = 'Randi' WHERE HIRE_DATE = '2028-04-23'";
		   
		     
		   // boolean fieldEffect =    stmp.execute(query2);
		     
		     int fieldEffect =    stmp.executeUpdate(query2);
		   
		     System.out.println(fieldEffect);
		     
		     //Close Connection
		      stmp.close();
		      con.close();
	     
			
		}
		catch(Exception x) {
			x.printStackTrace();
			x.getMessage();
		}
	}
}
