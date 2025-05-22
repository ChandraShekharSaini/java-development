public class PrimitiveToObject {

    public static void main(String[] args) {

        // Implicit
        int a = 90;
        Integer b = a;

        // Explicit
        int c = 12;
        Integer d = Integer.valueOf(c);
        System.out.println(d);

        String str = "123";
        Integer str1 = Integer.valueOf(str);
        System.out.println(str1);

        byte sh = -128;
        Byte sh1 = Byte.valueOf(sh);
        System.out.println(sh1);

        short bt = -12333;
        Short bt1 = Short.valueOf(bt);
        System.out.println(bt1);

    }
}