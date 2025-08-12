package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main implements Bank {

    @Override
    public void manual() {

    }

    @Override
    public void Amount() {
        System.out.println("This is the Amount method in the Main class implementing Bank interface.");
    }

    @Override
    public void defaultMethod() {
        System.out.println("This is the overridden default method in the Main class.");
    }

    public static void main(String[] args) {

       ArrayList<Bank> banks = new ArrayList<Bank>();

        Main main = new Main();
        main.Amount();
        main.manual();
        main.defaultMethod();

        Bank.getBank(); // Calling the static method from the interface

        System.out.println("The age is: " + Bank.age);


    }
}
