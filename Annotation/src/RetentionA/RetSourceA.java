package RetentionA;

import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.SOURCE)  
@interface MyA1{  
int value();  
}  
  
//Applying annotation

@MyA1(value=10)  
class RetSourceA {  

public void sayHello(){System.out.println("hello annotation");}  


    public static void main(String args[]){  
	  
	RetSourceA  h=new RetSourceA();  

    MyAnnotation  s= h.getClass().getAnnotation(MyAnnotation.class);

    System.out.println(s);
  

}


}  
  
