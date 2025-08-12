package jdbc1;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TablesName {

	public static void main(String[] args) {
		
		try {
			
			String url = "jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url , username , password);
			
			
			
		  DatabaseMetaData meta = 	con.getMetaData();
		  
		 ResultSet tables =  meta.getTables(null, null, "%", new  String[]{"TABLE"});
		 
		 while(tables.next()) {
			 
			   String tableName = tables.getString("TABLE_NAME");
			 
			   System.out.println(tableName);
		 }
		 
		 
		 tables.close();
		 con.close();
		  
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
