
public class Class {

    public static void main(String[] args) {

        Class.Add();

        new Class().Sub();
    }

    public static void Add() {

        //Non-static Method not accessible in 
        //static method(need to create Object)
        Sub();
        int a = 5;
        System.out.println(a);
    }

    public void Sub() {

        int a = 10;
        System.out.println(a);
    }
}
