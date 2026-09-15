import java.util.Scanner;

public class Soal47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();
        long total = 0;
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 == 0) total += i;
        }
        System.out.println("Total bilangan genap: " + total);
        sc.close();
    }
}
