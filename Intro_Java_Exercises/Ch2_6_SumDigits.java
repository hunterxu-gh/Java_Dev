import java.util.Scanner;

/**
 * Ch2_6_SumDigits
 */
public class Ch2_6_SumDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (range 0 - 1000): ");

        int digit = input.nextShort();
        int a = digit % 10;
        int b = digit / 10 % 10;
        int c = digit / 100 % 10;
        int sum = a + b + c;

        System.out.println("The sum of the digits is " + sum);
    }
}