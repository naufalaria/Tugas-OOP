// Output: 888888887777777654321543214444333211 (turun dari 8 ke 1, berpasangan)
public class Soal14 {
    public static void main(String[] args) {
        for (int i = 8; i >= 1; i--) {
            int group = (8 - i) / 2;
            boolean repeated = group % 2 == 0;
            if (repeated) {
                for (int j = 1; j <= i; j++) System.out.print(i);
            } else {
                for (int j = i; j >= 1; j--) System.out.print(j);
            }
            System.out.println();
        }
    }
}
