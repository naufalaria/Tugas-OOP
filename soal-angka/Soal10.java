// Output: 654321555554321333211 (baris i genap: urutan turun, i ganjil: repeat digit i)
public class Soal10 {
    public static void main(String[] args) {
        for (int i = 6; i >= 1; i--) {
            if (i % 2 == 0) {
                for (int j = i; j >= 1; j--) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
            System.out.println();
        }
    }
}
