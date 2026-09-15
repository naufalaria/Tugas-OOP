public class Pola19 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int i = 0; i < 6; i++) {
            if (i == 0 || i == 5) {
                for (int k = 0; k < lebar; k++) System.out.print("0");
            } else {
                System.out.print("0");
                for (int k = 0; k < lebar - 2; k++) System.out.print("*");
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
