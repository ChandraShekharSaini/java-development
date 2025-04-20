public class FinallyBloick {
    public static void main(String[] args) {

        System.out.println("---------------Program Start--------------------");
        try {
            int num1 = 12;
            int num2 = 0;
            System.out.println(12/0);
        }  catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("ArithmeticException caught");
        }

        finally{
            System.out.println("try cale ya catch , me to chalu ga he!!!");
        }


        System.out.println("---------------Program Start--------------------");
    }



}
