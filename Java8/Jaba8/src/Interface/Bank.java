package Interface;

public interface Bank {

    int age = 1222;

    void Amount();

    void manual();

    // Default method in the interface
    default void defaultMethod() {
        System.out.println("This is a default method in the Bank interface.");
    }

    // Static method in the interface
    static void getBank() {
        System.out.println("This is a bank interface.");
    }
}
