import java.util.Scanner;

public class Soal42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka > max) max = angka;
        }
        System.out.println("Bilangan terbesar: " + max);
        sc.close();
    }
}
