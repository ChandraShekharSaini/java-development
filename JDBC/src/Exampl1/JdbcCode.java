package Exampl1;

public class JdbcCode {
	
public static void main(String[] args) {
	
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("I am Good");
	}
	catch(Exception x) {
		
		 x.printStackTrace();
	}
}
}
