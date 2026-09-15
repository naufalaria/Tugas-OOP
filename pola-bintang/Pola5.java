public class Pola5 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < i - 1; s++) System.out.print(" ");
            for (int b = 0; b < 2 * (n - i) + 1; b++) System.out.print("*");
            System.out.println();
        }
    }
}
