public class Pola3 {
    public static void main(String[] args) {
        for (int rep = 0; rep < 2; rep++) {
            for (int i = 1; i <= 3; i++) {
                for (int b = 0; b < i; b++) System.out.print("*");
                System.out.println();
            }
        }
    }
}
