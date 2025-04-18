
public class NonStaticVariable {

    int age = 10;
    String name = "John";

    public static void main(String[] args) {

        new NonStaticVariable().age = 90;

        System.out.println(new NonStaticVariable().age);
        System.out.println(new NonStaticVariable().name);

        NonStaticVariable obj2 = new NonStaticVariable();
        obj2.age = 111;

        System.out.println(obj2.age);

    }
}
