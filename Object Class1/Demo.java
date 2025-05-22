public class Demo {

    public void Add() {

    }

    public static void main(String[] args) {
        Demo sc = new Demo();
        System.out.println(sc);
        System.out.println(sc.toString()); // Demo@15db9742

        Object obj = new Object(); // Demo@15db9742
        System.out.println(obj); // java.lang.Object@6d06d69c
    }
}
