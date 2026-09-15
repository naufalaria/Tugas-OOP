public class Pola20 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int rep = 0; rep < 2; rep++) {
            for (int k = 0; k < lebar; k++) System.out.print("0");
            System.out.println();
            for (int k = 0; k < lebar; k++) System.out.print("*");
            System.out.println();
            for (int k = 0; k < lebar; k++) System.out.print("=");
            System.out.println();
        }
    }
}
