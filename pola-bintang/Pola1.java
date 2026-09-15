public class Pola1 {
    public static void main(String[] args) {
        int lebar = 11;
        for (int i = 0; i <= 5; i++) {
            if (i == 0) {
                for (int k = 0; k < lebar; k++) System.out.print("*");
            } else {
                int bintang = 6 - i;
                int spasi = lebar - 2 * bintang;
                for (int k = 0; k < bintang; k++) System.out.print("*");
                for (int k = 0; k < spasi; k++) System.out.print(" ");
                for (int k = 0; k < bintang; k++) System.out.print("*");
            }
            System.out.println();
        }
    }
}
