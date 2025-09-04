package Write;

import java.io.FileWriter;
import java.util.Scanner;

public class WritterUser {

    public static void main(String[] args) {

        try{

            FileWriter file = new FileWriter("D:\\Java Development\\IO\\Write\\daa.txt");

            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            String password = sc.nextLine();
            String email = sc.nextLine();
            file.write("\n"+username);
            file.write("\n"+password);
            file.write("\n"+email);
            file.close();


            System.out.println("Done");
        }
        catch (Exception e){
          e.printStackTrace();
        }

    }

}
