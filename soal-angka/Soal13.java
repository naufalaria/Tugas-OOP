// Kebalikan pola Soal12, memanjang hingga baris ke-9
public class Soal13 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            boolean sequence = ((i - 1) / 2) % 2 == 0;
            if (sequence) {
                for (int j = 1; j <= i; j++) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
            System.out.println();
        }
    }
}
