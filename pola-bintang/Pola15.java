public class Pola15 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int i = 0; i < 6; i++) {
            for (int z = 0; z < lebar - (i + 1); z++) System.out.print("0");
            for (int b = 0; b <= i; b++) System.out.print("*");
            System.out.println();
        }
    }
}
