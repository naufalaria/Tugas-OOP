// Output: 5 2 7 4 9 6 11 8 13 10 15 12  => aturan: n-3, n+5, ...
public class Soal18 {
    public static void main(String[] args) {
        int n = 5;
        int jumlahSuku = 12;
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = (i % 2 != 0) ? n - 3 : n + 5;
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
