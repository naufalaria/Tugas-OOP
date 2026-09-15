// Animasi angka 0 berjalan di baris atas: kanan->kiri lalu kiri->kanan
public class Soal35 {
    public static void main(String[] args) throws InterruptedException {
        int lebar = 20;
        for (int i = lebar - 1; i >= 0; i--) { cetakBaris(i, lebar); Thread.sleep(100); }
        for (int i = 0; i < lebar; i++) { cetakBaris(i, lebar); Thread.sleep(100); }
    }
    static void cetakBaris(int posisi, int lebar) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lebar; i++) sb.append(i == posisi ? "0" : " ");
        System.out.println(sb.toString());
    }
}
