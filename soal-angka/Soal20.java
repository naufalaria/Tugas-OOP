// Output: 1 2 4 7 8 10 13 14 16 19 20 22 25  => aturan: n+1, n+2, n+3, berulang
public class Soal20 {
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 13;
        int[] tambah = {1, 2, 3};
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = n + tambah[(i - 1) % 3];
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
