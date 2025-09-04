package Write;

import java.io.FileWriter;
import java.io.IOException;

public class Write1Class {
    public static void main(String[] args) {

        try {
      
            FileWriter m = new  FileWriter("D:\\Java Development\\IO\\Write\\data.txt");

       
            m.write("I am Java aspirent");
            m.flush();
            m.write("\n"+"Hii I am Good HHi  Good");
            m.flush();
            m.write("Spingboot is very good");
            m.flush();
            m.write("Hi I am Java aspirent");
            m.flush();

            // flush and close
            // m.flush();
            m.close();

            System.out.println("Created Successfully");
        } catch (IOException x) {
            x.printStackTrace();
        }
    }
}
