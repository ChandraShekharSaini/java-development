package FunctionalInterface.and;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeMain {

    public static void main(String[] args) {

        List<Employe> list = new ArrayList<>();
        list.add(new Employe(1, "chandra", "Hyderabad", "Backend Developer"));
        list.add(new Employe(2, "shekhar", "Bengaluru", "Frontend Developer"));
        list.add(new Employe(3, "parul", "Hyderabad", "Backend Developer"));
        list.add(new Employe(4, "ram", "Jaipur", "Frontend Developer"));
        list.add(new Employe(5, "abhishek", "Chennai", "Devops"));
        list.add(new Employe(6, "rahul", "Roorkee", "Backend Developer"));

        Predicate<Employe> x1 = (Employe e) -> e.getLocation().equals("Hyderabad");
        Predicate<Employe> x2 = (Employe e) -> e.getRole().equals("Backend Developer");

        System.out.println("=======================And===================================");
        Predicate<Employe> a = x1.and(x2);

        for (Employe e : list) {
            if (a.test(e)) {
                System.out.println(e.getLocation() + " " + e.getRole());
            }
        }

        System.out.println("=======================Or===================================");
        Predicate<Employe> a1 = x1.or(x2);

        for (Employe e : list) {
            if (a1.test(e)) {
                System.out.println(e.getLocation() + " " + e.getRole());
            }
        }

    }
}
