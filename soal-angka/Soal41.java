// Animasi angka 0 berjalan di kolom kanan: bawah->atas lalu atas->bawah
public class Soal41 {
    public static void main(String[] args) throws InterruptedException {
        int tinggi = 10;
        int lebar = 10;
        for (int i = tinggi - 1; i >= 0; i--) { cetakFrame(i, tinggi, lebar); Thread.sleep(100); }
        for (int i = 0; i < tinggi; i++) { cetakFrame(i, tinggi, lebar); Thread.sleep(100); }
    }
    static void cetakFrame(int posisi, int tinggi, int lebar) {
        for (int i = 0; i < tinggi; i++) {
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k < lebar - 1; k++) sb.append(" ");
            sb.append(i == posisi ? "0" : " ");
            System.out.println(sb.toString());
        }
        System.out.println("----- frame -----");
    }
}
