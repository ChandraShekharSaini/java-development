//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
//            Throws1.add();

            Throws1.sub();
        } catch (Exception e) {
                System.out.println(e);
                System.out.println("Error Handled Here: "+ e.getMessage());
        }

    }
}