package RetentionA;


import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.SOURCE)  
@interface MyA11{  
int value();  
}  



//Applying annotation

@MyA11(value=10)  
class RetClassA  {  

public void sayHello(){System.out.println("hello annotation");}  


    public static void main(String args[]){  
	  
    RetClassA   h=new RetClassA();  

    MyAnnotation  s= h.getClass().getAnnotation(MyAnnotation.class);

    System.out.println(s); //null
  

}


}  
  