package MethodReferance;

@FunctionalInterface
interface ConsInter {
     Constructor getConstructor();
}

public class Constructor {

    public Constructor() {
        System.out.println("I am Constructor");
    }

    public static void main(String[] args) {

        ConsInter sc = Constructor::new;
        sc.getConstructor();
    }
}
