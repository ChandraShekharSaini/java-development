//  Subclasses cannot override the final method.  
public class Main extends Bank {

    
    @Override
    public void hii() {

        System.out.println("I am Good");
    }


    public static void main(String[] args) {

        Bank b = new Bank();

        b.hii();

    }
}
