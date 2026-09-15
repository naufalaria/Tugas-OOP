public class Pola7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int b = 0; b < i; b++) System.out.print("*");
            System.out.println();
        }
    }
}
