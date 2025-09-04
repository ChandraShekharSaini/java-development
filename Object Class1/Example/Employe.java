

public class Employe {
    
    private  String name;
      private  int  age;

      Employe(String name , int  age){

        this.name = name;
        this.age = age;
      }


      public String toString(){
        return name +"[ " + age +"]";
      }
}
