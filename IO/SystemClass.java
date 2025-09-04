import java.io.FileNotFoundException;
import java.io.FileReader;

public class SystemClass {
    public static void main(String[] arrs) {

        try {
            FileReader fr = new FileReader("D:\\Java Development\\IO\\File.txt");

            int c = fr.read();

            while (c != -1) {
                System.out.print((char) c);
                c = fr.read();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}