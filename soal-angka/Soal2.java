import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = sc.nextLine();
        System.out.print("Masukkan huruf yang dicari: ");
        char huruf = sc.next().charAt(0);
        int jumlah = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            if (Character.toLowerCase(kalimat.charAt(i)) == Character.toLowerCase(huruf)) {
                jumlah++;
            }
        }
        System.out.println("Huruf '" + huruf + "' muncul sebanyak " + jumlah + " kali");
        sc.close();
    }
}