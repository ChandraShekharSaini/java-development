import sun.tools.jar.JarException;

public class LuliSize {

       public static void checklLuli(int luli) throws Exception{

           if(luli >= 6){
               System.out.println("Luli size is 6,Pass");
           }
           else {
               System.out.println("Luli size is " + luli);
              throw new JattError("Luli size less than 6");
           }
       }



    public static void main(String[] args) {

        try {
            checklLuli(5);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}
