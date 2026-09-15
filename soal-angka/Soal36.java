// Animasi angka 0 berjalan di baris bawah: kiri->kanan lalu kanan->kiri
public class Soal36 {
    public static void main(String[] args) throws InterruptedException {
        int lebar = 20;
        int tinggi = 5; // baris bawah = beberapa baris kosong dulu
        for (int i = 0; i < lebar; i++) { cetakBaris(i, lebar, tinggi); Thread.sleep(100); }
        for (int i = lebar - 1; i >= 0; i--) { cetakBaris(i, lebar, tinggi); Thread.sleep(100); }
    }
    static void cetakBaris(int posisi, int lebar, int tinggi) {
        for (int b = 0; b < tinggi - 1; b++) System.out.println();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lebar; i++) sb.append(i == posisi ? "0" : " ");
        System.out.println(sb.toString());
        System.out.println("----- frame -----");
    }
}
