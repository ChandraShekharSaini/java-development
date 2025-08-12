package Lambda;

@FunctionalInterface
// A functional interface is an interface that contains only one abstract method.
// It can have multiple default or static methods, but only one abstract method.
// Functional interfaces can be used as the assignment target for a lambda expression or method reference.
interface MyFunctionalInterface {
    void display();
}

@FunctionalInterface
interface MyParameterizedInterface {
    void display(String message);

}

@FunctionalInterface
interface MyInterface {

    int add(int a, int b);

}


public class Example {

    public static void main(String[] args) {

        MyParameterizedInterface myFun = (name) -> {
            System.out.println("My selfe" + name);
        };

        myFun.display("My selfe");

        MyInterface myInterface = (a, b) -> a + b;

        System.out.println(myInterface.add(10, 20));

    }


}

