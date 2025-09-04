
public class Method {
    
    public static void main(String[] chan){

        StringBuilder str1 = new StringBuilder("Samsun");
        System.out.println(str1.append("Chanda"));
        System.out.println(str1.insert(1,"babu"));
        System.out.println(str1.replace(1, 2,"go"));
        System.out.println(str1.delete(1, 6));
        System.out.println(str1.reverse());
        System.out.println(str1.capacity());
        System.out.println(str1);
        System.out.println(str1.length());

    }
}
