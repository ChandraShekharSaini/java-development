package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class LastQuestion {

	public static void main(String[] args) {
		
		
		try {
			
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/my_data";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection(url , username , password);
			
			String query = "INSERT INTO EMPLOYE(name , hire_date) VALUES(?,?)";
			
			PreparedStatement stmp = con.prepareStatement(query);
			
			Scanner sc  = new Scanner(System.in);
			
			System.out.println("Enter no of records:");
			int n = sc.nextInt();
			
			con.setAutoCommit(false);
			
			while(n>0) {
				System.out.println("Enter Name");
				String name = sc.next();
				
				System.out.println("Enter hire_date");
				String date = sc.next();
				
				stmp.setString(1,name);
				stmp.setString(2, date);
				
				stmp.execute();
				
				n--;
			}
			
			con.commit();
			
		
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
