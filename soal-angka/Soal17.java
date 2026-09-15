// Output: 2 12 7 17 12 22 17 27 22 32  => aturan: n+10, n-5, ...
public class Soal17 {
    public static void main(String[] args) {
        int n = 2;
        int jumlahSuku = 10;
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = (i % 2 != 0) ? n + 10 : n - 5;
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
