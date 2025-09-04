package Reader;

import java.io.File;
import java.io.FileWriter;

public class Writter {

    public static void main(String[] args) {

      try {

          String path = "D:\\Java Development\\IO\\Reader\\Baba.txt";
          File file = new File(path);

          if(file.createNewFile()){
              FileWriter fw = new FileWriter(path);
              fw.write("Hello World");
              fw.write("I will become fine kjnjknhj.");

              fw.close();
          }else {
              System.out.println("File already exists");
          }


      }
      catch (Exception e) {
          e.printStackTrace();
      }
    }


}
