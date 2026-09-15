import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        StringBuilder sb = new StringBuilder(kalimat);
        System.out.println("Hasil terbalik: " + sb.reverse().toString());
        sc.close();
    }
}