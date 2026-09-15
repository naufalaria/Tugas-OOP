// Output: 122123444412345666666 (baris ganjil: urutan 1..i, baris genap: repeat digit i)
public class Soal9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
            System.out.println();
        }
    }
}
