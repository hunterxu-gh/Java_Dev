/**
 * TestNestedLoop
 */
public class TestNestedLoop {

    public static void main(String[] args) {
        System.out.printf("Multiplication Table \n    ");
        for (int i = 1; i <= 9; i++)
            System.out.printf("%4d", i);
        
        System.out.println("\n----------------------------------------");
        
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Tutorial:");
        // How to write a simple nested for-loop
        // First of all, write a row (which means a inner loop)
        System.out.println("#1. Writing a row");
        System.out.print(1 + " | ");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%4d", 1 * i);
        }
        // it works, then write the column, which means a outter loop
        System.out.println();
        System.out.println("#2. Writing 9 row");
        for (int j = 1; j <= 9; j++) {
            System.out.print(1 + " | ");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%4d", 1 * i);
            }
            System.out.println();
        }
        // finally, subtitute the number "1" with j
        System.out.println("#3. Writing a multiplication table");
        for (int j = 1; j <= 9; j++) {
            System.out.print(j + " | ");
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%4d", j * i);
            }
            System.out.println();
        }


    }
}