package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Lst2_8_SalesTax
 */
public class Lst2_8_SalesTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input the purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;

        System.out.println("The Sales tax is: $" + (int)(tax*100) / 100.0); 
        /*保留两位小数，则先转换为int类型，小数点向前移2位，
        再除以100.0——一是把小数点再移回去，二是再将结果转换为double类型。
        以输入为197.55为例，输出结果本该是11.853:
            tax * 100 = 1185.3 
            (int)(tax * 100) = 1185 
            (int)(tax * 100) / 100.0 = 11.85
        */
    }
} 