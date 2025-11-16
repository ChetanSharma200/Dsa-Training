public class EuclidienFormula {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int r = Integer.MAX_VALUE;
        while (r > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}