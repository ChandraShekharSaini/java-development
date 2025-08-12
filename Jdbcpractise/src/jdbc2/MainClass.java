package jdbc2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class MainClass {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		   Connection con = 	DriverManager.getConnection("jdbc:mysql://localhost:3306/my_data","root","root");
		   
		   String query = "SELECT * FROM employe";
		   
		   Statement stmp =    con.createStatement();
		   
		    ResultSet result =    stmp.executeQuery(query);
		
		
		while(result.next()) {
			System.out.println(result.getInt("id")+" | "+ result.getString("name")+" | "+result.getString("hire_date"));
		}
		
		stmp.close();
		con.close();
			
			
		}
		catch(Exception x) {
			x.printStackTrace();
		}
	}
}
