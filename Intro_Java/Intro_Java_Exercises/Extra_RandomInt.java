package Intro_Java_Exercises;

import java.util.Random;

/**
 * Extra_RandomInt
 * How do you generate a random integer i such that 10 <= i <= 50?
 * (int)(Math.random() * 40 + 10))
 * 很简单：Math.random()生成的数的范围是[0,1.0)
 * 加个int就是[0, 1)
 * 乘以n就是[0, n)
 * [10，50]就是[10, 51) -> [0, 41) + 10，即(int)(Math.random() * 41) + 10
 */
public class Extra_RandomInt {

    public static void main(String[] args) {

        Random rd = new Random();
        for (int i = 0; i < 60; i++)
            System.out.println((int)((rd.nextInt(4) + 1) * 10));
    }
}