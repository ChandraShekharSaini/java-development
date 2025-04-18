import java.util.*;
public class Intro{
    public static void main(String[] args){
        
        //Integer(32 bytes) 
        //  -2,147,483,648 to 2,147,483,647
        
        int n = -2147483648;
        System.out.println(n);

        int m = 2147483647;
        System.out.println(m);


      // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long num2 = 9223372036854775807L;
        System.out.println(num2);

        long num3 = 9223372036854775807l;
        System.out.println(num3);

       

       //6-7 decimal digits
        float num4 = 12567f;
        System.out.println(num4);
        
        float num5 = -125678f;
        System.out.println(num5);
     
        //15-16 decimal digits	
        double num6 = 456789012.345d;
        System.out.println(num6);
      
       //Single character (Unicode)	
        char ch = 'a';
        System.out.println(ch);

       //true or false
       boolean b = true;
       System.out.println(b);

    // -128 to 127
      byte ans1 = 127;
      System.out.println(ans1);

      byte ans2 = -128;
      System.out.println(ans2);

    // -32,768 to 32,767
      short ans3 = 32767;
      System.out.println(ans3);

      short ans4 = -32768;
      System.out.println(ans4);

      int kettlt;
      System.out.println(kettlt);

    }
}