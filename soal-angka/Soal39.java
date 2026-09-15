// Animasi angka 0 berjalan di kolom kiri: bawah->atas lalu atas->bawah
public class Soal39 {
    public static void main(String[] args) throws InterruptedException {
        int tinggi = 10;
        for (int i = tinggi - 1; i >= 0; i--) { cetakFrame(i, tinggi); Thread.sleep(100); }
        for (int i = 0; i < tinggi; i++) { cetakFrame(i, tinggi); Thread.sleep(100); }
    }
    static void cetakFrame(int posisi, int tinggi) {
        for (int i = 0; i < tinggi; i++) {
            System.out.println(i == posisi ? "0" : "");
        }
        System.out.println("----- frame -----");
    }
}
