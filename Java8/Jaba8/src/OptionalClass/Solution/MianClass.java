package OptionalClass.Solution;

import OptionalClass.Problem.MainClass;

import java.util.Optional;
import java.util.Scanner;

public class MianClass {

    protected String getName(int id) {

        String name = null;

        if (id == 100) {
            return name = "Babu Sona";
        } else if (id == 101) {
            return name = "Shekhar Sini";
        } else if (id == 102) {
            return name = "Chandra Baba";
        } else if (id == 103) {
            return name = "Rahaul Singh";
        } else {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the id of the Student: ");
        int id = sc.nextInt();

        MainClass main = new MainClass();
        Optional<String> name = Optional.ofNullable(main.getName(id));

        //If null not present then isPresent() method will execute
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("No such student");
        }

    }
}
