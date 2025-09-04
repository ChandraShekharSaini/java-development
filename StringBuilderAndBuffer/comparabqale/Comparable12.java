public class Comparable12 {
 
    private  String name;
    private  Integer age;
    private  String address;
  

    public Comparable12(String name , int age , String address){
        this.address=address;
        this.age=age;
        this.name=name;

    }


    public void setAddress(String address){
        this.address=address;
    }

    public String getAddress(){
        return  address;
    }

    public void setName(String name){

        this.name = name;
    }

    
    public String getName(){

        return name;
    }


    public void setAge(Integer age){
        this.age =age;
    }

    public Integer getAge(){
        return age;
    }


   @Override
public String toString() {
    return "Name: " + name + ", Age: " + age + ", Address: " + address;
}

    
}
