package Read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Read {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("D:\\Java Development\\IO\\Read\\Rand");
        
       int c=0;
       
       while (c!=-1){
           System.out.print((char)c);
          c=   file.read();
       }

    }
}
