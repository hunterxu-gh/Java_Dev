import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * TestRandom
 */
public class TestRandom {
    public static void main(String[] args) {
        final int MAX_QUESTIONS = 5;
        int questionCount = 0;
        int correctCount = 0;
        int num1, num2, result = 0;

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        // num1 = Math.random() * 10;
        // num2 = Math.random() * 10;


        while (questionCount <= MAX_QUESTIONS) {
            num1 = random.nextInt(10);
            num2 = random.nextInt(10);
            
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            System.out.println("What is " + num1 + " - " + num2 + " equals? " );

            try {
                result = input.nextInt();
            } catch (InputMismatchException ex) {
                //TODO: handle exception
                // 不能直接处理异常，否则程序会中断，只能抛出
                System.out.println("Please input an integer!");
                // throw ex;
                continue;
                // break;
            }
            
            if (result == num1 - num2) {
                System.out.println("You are right!");
                correctCount++;
                // break;
            }
            else
                System.out.println("You are wrong.");
            
            questionCount++;
            
        }
        System.out.println("The number of correct questions is: " + correctCount);
    }
}