package Buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws IOException {

        String path = "D:\\Java Development\\IO\\Buffer\\baba.txt";
        FileReader fr = new FileReader(path);

        BufferedReader br = new BufferedReader(fr);

             String line =   br.readLine();

             while (line != null) {
                 System.out.println(line);
                 line = br.readLine();
             }

    }
}
