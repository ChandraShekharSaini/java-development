
public class LocalMethod {

    public static void main(String[] args) {

        //static   int n = 90;
        // System.out.println(n);
        String name = "Chandra";
        char nm = 'b';

        System.out.println(name);
        System.out.println(nm);

        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }

        // System.out.println(i); //will give error,i is local for loop

        
        int age = 90;  //will give error canot decalare as private,protected
        System.out.print(age);
    }
}
