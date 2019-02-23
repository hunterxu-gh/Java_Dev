package Intro_Java_Exercises.zju;

import java.util.HashMap;
import java.util.Scanner;

/**
 * the use of HashMap
 */
public class Coin {
    private HashMap<Integer, String> coinname = new HashMap<Integer, String>();

    public Coin() {
        coinname.put(1, "penny");
        coinname.put(10, "dime");
        coinname.put(25, "quarter");
        coinname.put(50, "half-dollar");
    }

    public String getName(int amount) {
        return coinname.get(amount);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        Coin coin = new Coin();
        System.out.println(coin.getName(amount));
    }
}