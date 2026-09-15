public class Pola4 {
    public static void main(String[] args) {
        int n = 6;
        int lebar = 2 * n - 1;
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                for (int k = 0; k < lebar; k++) System.out.print("*");
            } else {
                int gap = 2 * (n - i) - 1;
                for (int k = 0; k < i; k++) System.out.print("*");
                for (int k = 0; k < gap; k++) System.out.print(" ");
                for (int k = 0; k < i; k++) System.out.print("*");
            }
            System.out.println();
        }
    }
}
