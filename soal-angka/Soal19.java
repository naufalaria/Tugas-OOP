// Output: 3 9 4 12 7 21 16 48 43 129  => aturan: n*3, n-5, ...
public class Soal19 {
    public static void main(String[] args) {
        int n = 3;
        int jumlahSuku = 10;
        System.out.print(n);
        for (int i = 1; i < jumlahSuku; i++) {
            n = (i % 2 != 0) ? n * 3 : n - 5;
            System.out.print(" " + n);
        }
        System.out.println();
    }
}
