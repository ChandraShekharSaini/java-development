package InputOutputStream;

import java.io.*;

public class input {

	
public static void main(String[] args) {

	
	String path = "C:\\Users\\saini\\OneDrive\\Desktop\\chandra.txt";
	
	
	
	try {
		FileReader f = new FileReader(path);
		
		int c= f.read();
		
		while(c!=-1) {
			System.out.println((char) c);
			
			c = f.read();
		}
	}
	catch(Exception c){
	   c.getMessage();
	   c.printStackTrace();
	}
	
}
}
