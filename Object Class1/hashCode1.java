public class hashCode1 {

    public int hashCode() {
        System.out.println(super.hashCode());
        return 123;
    }

    public static void main(String[] args) {

        hashCode1 sc = new hashCode1();
        System.out.println(sc);
    }
}
