// Output: 666666123454444123221 (baris i genap: repeat digit i, i ganjil: urutan naik)
public class Soal11 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) System.out.print(i);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(j);
            }
            System.out.println();
        }
    }
}
