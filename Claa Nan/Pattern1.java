
public class Pattern1 {

    public static void main(String[] args) {

        Pattern(5);
        Pattern2(5);
        Pyramid3(5);
        PyramidMagic(5);

    }

    public static void Pattern(int n) {

        int row = 1;
        int star = n;

        while (row <= n) {

            int i = 1;
            while (i <= star) {
                System.err.print("* ");
                i++;
            }

            row++;
            System.err.println();
        }

    }

    public static void Pattern2(int n) {

        int row = 1;
        int star = n;

        int i = 1;
        while (i <= star) {
            int j = 1;
            while (j <= star) {
                if (i + j == n + 1 || i == j) {
                    System.err.print("*");
                } else {
                    System.err.print(" ");
                }

                j++;
            }
            System.err.println();
            i++;
        }

        row++;

    }

    public static void Pyramid3(int n) {

        int row = 1;
        int start = 1;
        int space = n - 1;

        while (row <= n) {

            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            //star
            int i = 1;
            while (i <= start) {
                System.out.print("* ");
                i++;
            }

            row++;
            space -= 1;
            start += 2;
            System.out.println();

        }
    }

    public static void PyramidMagic(int n) {

        int row = 1;
        int start = 1;
        int space = n - 1;

        while (row <= n) {

            //space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            //star
            int i = 1;
            while (i <= start) {
                if (i % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                i++;
            }

            row++;
            space -= 1;
            start += 2;
            System.out.println();

        }
    }

}
