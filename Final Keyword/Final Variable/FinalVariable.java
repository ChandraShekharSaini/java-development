
public class FinalVariable {

    // Blank final variable
    final int age;

    // Q) Can we initialize a blank final variable?
    // Ans) Yes, but only in the constructor. For example:
    public FinalVariable() {
        age = 89;
    }

    public static void main(String[] args) {

        FinalVariable sc = new FinalVariable();

        System.out.println(sc.age);
    }
}