import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lst12_5review
 */
public class Lst12_5review {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ifContinue = true;

        do {
            try {
                int i = input.nextInt();
                System.out.println(i);
                ifContinue = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("MisInput");
                input.nextLine();
            }
        } while (ifContinue);
    }
}