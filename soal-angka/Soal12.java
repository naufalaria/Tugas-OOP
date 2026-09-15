// Pola berulang tiap 2 baris, memanjang hingga baris ke-9 (bisa diubah n-nya)
public class Soal12 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            boolean repeated = ((i - 1) / 2) % 2 == 0;
            if (repeated) {
                for (int j = 1; j <= i; j++) System.out.print(i);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(j);
            }
            System.out.println();
        }
    }
}
