package jdbc1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class AddMultipleQuery {
	public static void main(String[] args) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String  password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url ,username , password);
			
			Statement stmp = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , 0);
			
			String query1 = "INSERT INTO EMPLOYE(name  , hire_date) VALUES('RAMA','2023-10-05')";
			String query2 = "INSERT INTO EMPLOYE(name  , hire_date) VALUES('Pritvi','2021-05-01')";
			String query3 = "INSERT INTO EMPLOYE(name  , hire_date) VALUES('Nama Singh','2021-06-08')";
			
			
			//It is costlier task to execute stmp.execute() method for multiple query statement
			//Better to use addBatch() method
//			stmp.execute(query1);
//			stmp.execute(query2);
//			stmp.execute(query3);
		   
			stmp.addBatch(query1);
			stmp.addBatch(query2);
			stmp.addBatch(query3);
			
		int[] arr = 	stmp.executeBatch();
		
		for(int x:arr) {
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




