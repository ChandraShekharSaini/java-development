package OptionalClass.Problem;

import java.util.Scanner;


//Problem //Problem//Problem//Problem//Problem
//Problem//Problem//Problem//Problem//Problem
public class MainClass {

    public String getName(int num) {
        String name = null;
        if (num == 100) {
            return "Chandra";
        } else if (num == 200) {
            return "Shekhar";
        } else if (num == 300) {
            return "Khan";
        } else {
            return name;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Without Optinal Class ");

        System.out.print("Enter the id of the person:");
        int id = in.nextInt();

        MainClass sc = new MainClass();
        String name = sc.getName(id);

        //NullPonterException ---> Null
        System.out.println(name.toUpperCase());
    }
}
