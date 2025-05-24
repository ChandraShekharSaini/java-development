public class MainClass {
    public static void main(String[] args) {

        Bank b = new Bank();
        System.out.println("Id:" + b.getId() + " and " + "Password: " + b.getPassword());

        b.setId(8900);
        b.setPassword(67655);

        System.out.println("Id:" + b.getId() + " and " + "Password: " + b.getPassword());
    }
}
