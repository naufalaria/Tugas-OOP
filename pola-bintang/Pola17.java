public class Pola17 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int i = 0; i < 6; i++) {
            int posisiBintang = lebar - 1 - i;
            for (int k = 0; k < lebar; k++) {
                System.out.print(k == posisiBintang ? "*" : "0");
            }
            System.out.println();
        }
    }
}
