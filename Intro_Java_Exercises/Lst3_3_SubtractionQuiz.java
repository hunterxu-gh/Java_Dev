import java.util.Scanner;

/**
 * Lst3_3_SubtractionQuiz
 */
public class Lst3_3_SubtractionQuiz {

    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println
        ("What is " + num1 + " - " + num2 + " = ?");
        Scanner input = new Scanner(System.in);
        int ans = input.nextInt();

        if (num1 - num2 == ans)
            System.out.println("Correct!");
        else {
            System.out.println("Wrong");
            System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
        }
    }
}