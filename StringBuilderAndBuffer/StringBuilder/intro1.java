
public class intro1{
    public static void main(String[] args){

        StringBuilder str1 = new StringBuilder();

        str1.append("Chandra");

        System.out.println(str1);

        StringBuilder str2 =  str1;

        
         str2.append(" Saini");

          System.out.println(str1); // orignal string
          System.out.println(str2);



    }
}