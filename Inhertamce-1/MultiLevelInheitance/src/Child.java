

public class Child extends  Father{

    void ChildTrait() {
        System.out.println("Hi!!, I am Child , I have curosity");
    }


    public static void main(String[] args) {

        Child child = new Child();
        child.ChildTrait();

        child.GrandFatherTrait();
        child.FatherTrait();

        //But you have to make oject of Father class in order to use Father's Properties
        Father father = new Father();
//         father.FatherTrait();

        //But you have to make oject of GrandFather class in order to use GrandFather's Properties
         GrandFather grandFather = new GrandFather();
//         grandFather.GrandFatherTrait();
    }
}
