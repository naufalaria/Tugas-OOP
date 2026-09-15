public class Pola18 {
    public static void main(String[] args) {
        int lebar = 7;
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < lebar; k++) {
                System.out.print(k == i ? "*" : "0");
            }
            System.out.println();
        }
    }
}
