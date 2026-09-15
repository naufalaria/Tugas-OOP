// Output: 112333123455555123456 (baris ganjil: repeat digit i, baris genap: urutan 1..i)
public class Soal8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) System.out.print(i);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(j);
            }
            System.out.println();
        }
    }
}
