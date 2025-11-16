import java.util.HashSet;

public class NestedLoop {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        // p.downPyramid(5);
        // p.upWithSpacePyramid(5);
        // p.downWithSpacePyramid(5);
        // p.characterPyramid(5);
        // p.holoSquare(5);
        // p.numberPyramid(5);
        // p.halfKajuKatli(8);
        // System.out.println();
        // p.cross(9);
        p.swastik(30);
    }
}

class Pattern {

    public static void downPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upWithSpacePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void downWithSpacePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void holoSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n || i == 1 || j == 1 || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void cross(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || (i + j) == (n + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void characterPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print((char) (j + 64));

            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i)
                    System.out.print((k++));

            }
            System.out.println();
        }
    }

    public static void halfKajuKatli(int n) {

        for (int i = 1; i < 2 * n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i && i <= n || i >= n && j >= (i - n + 1))
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void swastik(int n) {
        int mid = (int) Math.ceil(n / 2.0);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 && i < mid || i == 1 && j > mid)
                    System.out.print("* ");
                else if (j == mid || i == mid || i == n && j < mid || i >= mid && j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
