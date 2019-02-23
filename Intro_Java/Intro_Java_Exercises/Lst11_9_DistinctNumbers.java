package Intro_Java_Exercises;

import java.util.Scanner;
import java.util.ArrayList;
/**
 * Lst11_9_DistinctNumbers
 */
public class Lst11_9_DistinctNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        //for (int i = 0; i < list.size(); i++)
        for (Integer i : list) // or for(int i : list)
            System.out.print(list.get(i) + " ");
    }
}