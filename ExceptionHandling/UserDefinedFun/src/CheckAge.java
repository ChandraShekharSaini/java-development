public class CheckAge {


    public static void checkAge(int age) throws  Exception{
        if(age>=90){
            System.out.println("You are older than 90 years");
        }
        else{

            throw new InvalidException("I am not older then 90 years");

        }
    }

    public static void main(String[] args) {

        try{
            checkAge(20);
        }
        catch(Exception e){
            System.out.println("Exception aya he");
             System.out.println(e);
             e.printStackTrace();
        }
    }
}
