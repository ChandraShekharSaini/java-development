package jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetMetaData {
  
	public static void main(String[] args) {
		
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url , username , password);
			
			Statement stmp =  con.createStatement();
			
//			String query = "SELECT * FROM employe";
//			
//			ResultSet result =  stmp.executeQuery(query);
			
			DatabaseMetaData meta  = con.getMetaData();
			
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDriverName());
			System.out.println(meta.getDriverVersion());
		    System.out.println(meta.getDriverMajorVersion());
		    System.out.println(meta.getDriverMinorVersion());
			System.out.println(meta.getDatabaseProductVersion());
			
			System.out.println(meta.getUserName());
			System.out.println(meta.getURL());
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}

