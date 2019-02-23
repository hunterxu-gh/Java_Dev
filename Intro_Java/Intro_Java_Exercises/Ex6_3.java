import java.util.Scanner;

/**
 * Ex6_3
 */
public class Ex6_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPalindrome(number))
            System.out.println(number + " is a palindrome number!");
        else
            System.out.println(number + " is NOT a palindrome number!");
    }

    // Reversed number
    public static int reverse(int number) {
        int reversedNum = 0;
        while (number != 0) {
            int reminder = number % 10;
            
            reversedNum = reversedNum * 10 + reminder; // Core

            number = number / 10;
        }

        return reversedNum;
    }

    public static boolean isPalindrome(int number) {
        return (reverse(number) == number);
    }
}