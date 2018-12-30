import javax.lang.model.util.ElementScanner6;

/**
 * Lst6_1_TestMax
 */
public class Lst6_1_TestMax {
    public static int Max(int x, int y) {
        if (x > y)
            return x;
        else if (x < y)
            return y;
        else 
            return 0;
    
    }
    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int k = Max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
}