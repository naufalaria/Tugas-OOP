public class Pola6 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
    }
}
