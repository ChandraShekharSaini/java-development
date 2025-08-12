package jdbc1;


import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class UserInput {

	public static void main(String[] args) {
		
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			//1. Load Driver 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Register Driver and create Connection
			Connection con = DriverManager.getConnection(url , username , password);
		
		    String query = "INSERT INTO EMPLOYE(name , hire_date) VALUES(?,?)";
		   
		    //3. Create Statement
		    // Using PreparedStatement avoids dangerous SQL injection attacks.
			PreparedStatement stmp =  con.prepareStatement(query);
			
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter name: ");
			String name = sc.next();
			System.out.print("Enter hire_date: ");
			String date = sc.next();
			
			//4. Execute Query
			stmp.setString(1, name);
			stmp.setString(2, date);
			
			int status =  stmp.executeUpdate();
			System.out.println(status);
			System.out.println("Data Saved To DataBase");
			
					
			//5. Close Connection
			stmp.close();
			con.close();
			
		}
		catch(Exception x){
			x.printStackTrace();
		}
	}
}
