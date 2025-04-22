
public class throw1 {
     void add(){
         try{
             System.out.println("-------Program Start-------");
             System.out.println(12/0);

             System.out.println("-------Program Ends-------");
         }
          catch(Exception e){
             System.out.println("-----Catch Block Executed-----");
             System.out.println(e);

             throw  new ArithmeticException("Error Thrown");

          // Statement below throw keyword do not execute
          }
         finally {
            // This can be overcome by placing the statements within the finally block.
             System.out.println("------Catch Block Executed-----");
         }

     }
    public static void main(String[] args) {
        throw1 throw1 = new throw1();

        throw1.add();
    }
}