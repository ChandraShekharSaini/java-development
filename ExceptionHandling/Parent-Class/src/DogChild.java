import java.io.IOException;
import java.sql.SQLException;
public class DogChild extends  AnimalParent{
    @Override
    void m1()  throws  ArrayIndexOutOfBoundsException{
        System.out.println("Now i changed by DogParent class");

        throw new ArrayIndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        
        DogChild dog = new DogChild();

       try{
           dog.m1();
       }
       catch(Exception e){
           System.out.println(e);
       }

    }
}


