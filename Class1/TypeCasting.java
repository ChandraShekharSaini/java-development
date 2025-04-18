public class TypeCasting{
    public static void main(String[] args) {

        char ch1 = 'A';
        System.out.println((int) ch1); //65

        char ch2 = 'Z';
        System.out.println((int) ch2); //90

        char ch3 = 'a';
        System.out.println((int) ch3); //97

        char ch4 = 'z';
        System.out.println((int) ch4); //122


        double d1 = 10908.5;
        System.out.println((int) d1); //10908




        float f1 = 10999908.5f;
        System.out.println((int) f1); //10999908
    }
}