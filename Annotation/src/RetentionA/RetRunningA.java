package RetentionA;



import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnnotation{  
int value();  
}  
  
//Applying annotation

@MyAnnotation(value=10)  
class RetRunningA{  

public void sayHello(){System.out.println("hello annotation");}  



public static void main(String args[])throws Exception{  
	  
	RetRunningA h=new RetRunningA();  

MyAnnotation  s= h.getClass().getAnnotation(MyAnnotation.class);

System.out.println(s.value());
  

}




}  
  
