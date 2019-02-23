/**
 * Lst18_2_Fibonacci
 * 规律：除了0和1外，其余所有数都是前两个数之和（f(x) = f(x-1) + f(x-2)）
 */
public class Lst18_2_Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
    }

    public static long fibonacci(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fibonacci(number - 2) + fibonacci(number - 1);
    }
}