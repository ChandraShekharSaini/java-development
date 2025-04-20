

//Child Class
public class Kunal extends Chandramuki{

    public  void action(){
        System.out.println("I am Child Class");
        System.out.println("I am Kunal");
    }

       int num = 100;


    public static void main(String[] args) {
        Kunal sc= new Kunal();
        sc.action();
        System.out.println(sc.num);

      sc.sound();

    }
}
