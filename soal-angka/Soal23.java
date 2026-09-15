import java.util.Scanner;

public class Soal23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai maksimum: ");
        int maks = sc.nextInt();
        long a = 0, b = 1;
        System.out.print(a);
        while (b <= maks) {
            System.out.print(", " + b);
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
        sc.close();
    }
}
