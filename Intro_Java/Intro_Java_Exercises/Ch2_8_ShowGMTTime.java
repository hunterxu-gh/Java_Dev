package Intro_Java_Exercises;

import java.util.Scanner;

import com.sun.javafx.runtime.SystemProperties;

/**
 * Ch2_8_ShowGMTTime
 */
public class Ch2_8_ShowGMTTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int setGMT = input.nextInt();

        long totalMillSeconds = System.currentTimeMillis();
        //long totalSeconds = System.currentTimeMillis() / 1000;
        long totalSeconds = totalMillSeconds / 1000;
        long currentScends = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24 + setGMT;

        System.out.println("Current Time is: " + currentHours + ":" + currentMinutes +
                            ":" + currentScends + " GMT.");                  
    
    }
}