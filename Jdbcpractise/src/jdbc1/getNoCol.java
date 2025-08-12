package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class getNoCol {
 
	public static void main(String[] args) {
		
		try {
			String url ="jdbc:mysql://localhost:3306/my_data";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con = 	DriverManager.getConnection(url , username,password);
		
	    Statement stmp =  con.createStatement();
	    
	    String query = "SELECT * FROM employe";
	     
	    ResultSet result =  stmp.executeQuery(query);
	    
	    ResultSetMetaData meta = result.getMetaData();
	    
	    System.out.println(meta.getColumnCount());
	    System.out.println(meta.getColumnType(1));
	    System.out.println(meta.getColumnName(1));
	    System.out.println(meta.getColumnName(2));
	    System.out.println(meta.getColumnName(3));
	    System.out.println(meta.getColumnDisplaySize(1));
	    
	   // System.out.println(meta.isNullable(3));
	    
	    System.out.println(meta.getPrecision(2));     
	   
	    System.out.println(meta.getColumnName(2));
	    
	    System.out.println(meta.getSchemaName(1));
	    
	    System.out.println(meta.getTableName(2));
	    
	    System.out.println(meta.isWritable(2));
	    
	    
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
