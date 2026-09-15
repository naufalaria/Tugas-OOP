// Kebalikan pola Soal14
public class Soal15 {
    public static void main(String[] args) {
        for (int i = 8; i >= 1; i--) {
            int group = (8 - i) / 2;
            boolean sequence = group % 2 == 0;
            if (sequence) {
                for (int j = i; j >= 1; j--) System.out.print(j);
            } else {
                for (int j = 1; j <= i; j++) System.out.print(i);
            }
            System.out.println();
        }
    }
}
