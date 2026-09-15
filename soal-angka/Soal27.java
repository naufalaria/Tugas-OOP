import java.util.Scanner;

public class Soal27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tahun awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan tahun akhir: ");
        int akhir = sc.nextInt();
        System.out.println("Tahun kabisat (angka akhir 6) dari " + awal + " s.d. " + akhir + ":");
        for (int tahun = awal; tahun <= akhir; tahun++) {
            if (tahun % 10 == 6) {
                boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);
                if (kabisat) {
                    System.out.print(tahun + " ");
                }
            }
        }
        System.out.println();
        sc.close();
    }
}
