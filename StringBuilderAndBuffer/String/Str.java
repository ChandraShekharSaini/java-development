public class Str {
    public static void main(String[] args) {

        //Ways of creating string
         
        //1. Mehod 1
        char[] ch = {'A','B','C','D'};
        String str1 = new  String(ch);
        System.out.println(str1);

        
        //2. Mehod 2
        byte[] byteArray = { 72, 101, 108, 108, 111 };
        String str4 = new  String(byteArray);
        System.out.println(str4);


        //2. Mehod 3
         String str2  = new  String("chandra");
         System.out.println(str2);


         //3. Method 4
        String str3   = "shekhar";
        System.out.println(str3);
        

    }
}
