public class MainCode {

    public  static void checkAge(int age) throws  InvalidException{

        if(age>=18){
            System.out.println("You are Pass");
        }
        else{
            System.out.println("You are  Fail");

            throw new InvalidException("Bhai Tum Fail Ho Gaya ho");

           // throw new InvalidException();
        }
    }

    public static void main(String[] args) {

        try{
             checkAge(10);
        }
        catch (Exception e){
            System.out.println("Exception aya he");
            System.out.println(e);

           e.printStackTrace();
        }
    }
}

