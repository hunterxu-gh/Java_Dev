/**
 * Ex6_2
 */
public class Ex6_2 {

    public static void main(String[] args) {
        System.out.println(sumDigits(123));
        System.out.printf("%15s%15s\n", "n", "m(n)");
        System.out.println("-------------------------------------------");
        for(int i = 1; i <= 10; i++) {
        System.out.printf("%15d%15.2f\n",i, m(i));
        }
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num = num / 10; 
        }

        return sum;
    }

    public static double m(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (2 * i + 1.0) / (3 * i - 2);
        return sum;
    }
}