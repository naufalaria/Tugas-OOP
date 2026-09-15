// Output: 1 2 4 8 16 32 64 128 256 512 (perpangkatan 2)
public class Soal21 {
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 10;
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = n * 2;
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
