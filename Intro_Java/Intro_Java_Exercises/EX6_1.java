/**
 * EX6_1
 */
public class EX6_1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%7d", getPentagonalNumber(i));
            if (i % 10 == 0)
                System.out.println();
        }
    }

    public static int getPentagonalNumber(int num) {
        return num * (3 * num - 1) / 2;
    }
}