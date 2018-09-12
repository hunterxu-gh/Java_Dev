import java.util.Random;
import java.util.Scanner;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        Random rand = new Random();
        //System.out.println(rand.nextInt(10) + 51);
        for (int i = 0; i < 50; i++)
            System.out.println(rand.nextInt(10) + 51);
    }
}