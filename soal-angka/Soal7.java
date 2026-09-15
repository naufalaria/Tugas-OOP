// Output per baris: 654321 / 54321 / 4321 / 321 / 21 / 1
public class Soal7 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
