import java.util.Scanner;

public class Soal49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan n_awal: ");
        int awal = sc.nextInt();
        System.out.print("Masukkan n_akhir: ");
        int akhir = sc.nextInt();
        System.out.println("Bilangan prima dari " + awal + " s.d. " + akhir + ":");
        for (int i = awal; i <= akhir; i++) {
            if (isPrima(i)) System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }

    static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
