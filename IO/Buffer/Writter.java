package Buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writter {

    public static void main(String[] args) throws IOException {

        String path = "D:\\Java Development\\IO\\Buffer\\baba.txt";

        FileWriter fw = new FileWriter(path , true);
        BufferedWriter bwritter = new BufferedWriter(fw);

       bwritter.newLine();
       bwritter.write("I am Good");
       bwritter.newLine();
        bwritter.write("I am Good");
        bwritter.newLine();
        bwritter.write("I am Good");
        bwritter.newLine();

        bwritter.flush();
        bwritter.close();


    }
}
