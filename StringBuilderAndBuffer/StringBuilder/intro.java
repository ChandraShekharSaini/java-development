
public class intro{
    public static void main(String[] args) {
        
        StringBuffer str1 = new  StringBuffer("Hi");
        StringBuffer str2 = new   StringBuffer("Hi");
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        
        if(str1.equals(str2)){
            System.out.println("Srings are equal");
        }
        else{
            System.out.println("Srings are  not  equal");
        }


        if(str1 == str2){
            System.out.println("Srings are  same");
        }
        else{
            System.out.println("Srings are not  same");
        }


    }
}