public class _1 {
    public static void main(String[] args) {

        int n = 123;
        int nm = 123;

        String str1 = "Chandra Shekhar Saini";
        String str2 = "Rahul Saini";

        Add(str1, str2);

        Short[] arr1 = { 1, 2, 3, 4 };
        Character[] arr2 = { 'a', 'b', 'c', 'd' };

        Array1(arr1, arr2);
    }

    public static <N, Nm> void Array1(N[] arr1, Nm[] arr2) {
        for (N x : arr1) {
           System.out.println(x);
        }
    }

    public static <N, Nm> void Add(N n, Nm nm) {

        System.out.println(n);
        System.out.println(nm);
    }

}