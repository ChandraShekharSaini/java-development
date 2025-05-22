public class ObjectToPrimitive {
    public static void main(String[] args) {

        // Implicit
        Integer a = 123;
        int b = a;

        // Explicit
        Integer c = 233;
        int c1 = c.intValue();
        System.out.println(c1);

        Byte bt = 127;
        short bt1 = bt.shortValue();
        System.out.println(bt1);

        Short st = 32000;
        short st1 = st.shortValue();
        System.out.println(st1);

    }
}
