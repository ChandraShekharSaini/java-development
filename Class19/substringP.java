public class substringP {

    static int count = 0;

    public static void main(String[] args) {
        String str = "abcbdd";
        System.out.println(SubString(str));  // Output: true or false
    }

    public static boolean SubString(String str) {
        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String sub = str.substring(i, j);
                System.out.println(sub);

                if (checkSubString(sub)) {
                    count++;
                    if (count == 3) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean checkSubString(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
