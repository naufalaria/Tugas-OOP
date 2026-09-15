public class Pola8 {
    public static void main(String[] args) {
        int lebar = 11;
        for (int i = 0; i < 5; i++) {
            System.out.print("0");
            for (int k = 0; k < lebar - 1; k++) System.out.print("*");
            System.out.println();
        }
        for (int k = 0; k < lebar; k++) System.out.print("0");
        System.out.println();
    }
}
