// Output: 1 5 3 7 5 9 7 11 9 13 11 15  => aturan: n+4, n-2, n+4, n-2, ...
public class Soal16 {
    public static void main(String[] args) {
        int n = 1;
        int jumlahSuku = 12;
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = (i % 2 != 0) ? n + 4 : n - 2;
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
