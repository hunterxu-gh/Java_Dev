package Intro_Java_Exercises;

/**
 * Lst10_7_TestStackOfIntegers
 */
public class Lst10_7_TestStackOfIntegers {

    public static void main(String[] args) {
        Lst10_8_StackOfIntegers stack = new Lst10_8_StackOfIntegers();

        for (int i = 0; i < 10; i++)
            stack.push(i);

        while (!stack.empty())
            System.out.println(stack.pop() + " ");
    }
}