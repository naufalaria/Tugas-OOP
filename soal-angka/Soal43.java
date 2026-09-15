import java.util.Scanner;

public class Soal43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = sc.nextInt();
            if (angka < min) min = angka;
        }
        System.out.println("Bilangan terkecil: " + min);
        sc.close();
    }
}
