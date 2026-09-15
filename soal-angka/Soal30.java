import java.util.Scanner;

public class Soal30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();
        System.out.println("Bilangan habis dibagi 4 dari " + awal + " s.d. " + akhir + ":");
        for (int i = awal; i <= akhir; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
    }
}
