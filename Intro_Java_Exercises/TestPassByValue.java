/**
 * TestPassByValue
 */
public class TestPassByValue {

    public static int increaseInt(int n) {
        ++n;
        System.out.println("n inside the method is " + n);
        return n;
    }

    public static void increment(int m) {
        ++m;
        System.out.println("m inside the method is " + m);
    }
    public static void main(String[] args) {
        int n = 1, m = 1;
        System.out.println("The initial n is " + n);
        n = increaseInt(n);
        System.out.println("After calling the method, n is " + n);
        
        System.out.println("The initial m is " + m);
        increment(m);
        System.out.println("After calling the method, m is " + m);
    }
}