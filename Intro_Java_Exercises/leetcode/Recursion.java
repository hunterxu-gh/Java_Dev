/**
 * Recursion
 */
public class Recursion {


    // 打印从0-n
    public static void print(int n) {
        // 打印0 - (n - 1)项
        if (n > 0) print(n-1); // 这个print的调用会在n=0时停止，此时所有的print调用都压入了栈中
        // 打印n
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(9);
    }
}