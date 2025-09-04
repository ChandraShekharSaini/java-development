package Reader;

import java.io.FileReader;

public class Reader {
    public static void main(String[] args) {

        String path = "D:\\Java Development\\IO\\Reader\\Baba.txt";

       try {
           FileReader fr = new FileReader(path);
           int c=0;
           while (c!=-1){
               System.out.print((char)c);
               c = fr.read();
           }
       }catch (Exception e){
           e.printStackTrace();
       }

    }
}
