public class Pola13 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int i = 0; i < 6; i++) {
            for (int z = 0; z <= i; z++) System.out.print("0");
            for (int b = 0; b < lebar - (i + 1); b++) System.out.print("*");
            System.out.println();
        }
    }
}
