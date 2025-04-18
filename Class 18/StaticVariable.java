
public class StaticVariable {

    static String name = "Chandra";
    static int age = 90;

    boolean flag;
    int data;

    public static void main(String[] args) {

        name = "Babu ji";

        System.out.println(name);
        System.out.println(age);
        System.out.println(StaticVariable.name);
        System.out.println(StaticVariable.age);

    }
}
