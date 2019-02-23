import java.util.Scanner;

/**
 * Lst18_1_ComputeFactorials
 */
public class Lst18_1_ComputeFactorials {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(factorial(number));
    }

    public static long factorial(int number) {
        if (number == 0)
            return 1;
        else
            return factorial(number - 1) * number;
    }

    // Method 2 with tail recursion
    public static long factorial2(int number) {
        return factorial2(number, 1);
    }

    public static long factorial2(int number, long result) {
        if (n == 0)
            return result;
        else
            return factorial2(number - 1, number * result);
    }
}