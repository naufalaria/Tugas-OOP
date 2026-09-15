public class Pola10 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i >= 1; i--) {
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= n - 1; i++) {
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
    }
}
