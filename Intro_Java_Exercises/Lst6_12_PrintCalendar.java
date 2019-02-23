package Intro_Java_Exercises;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import edu.princeton.cs.algs4.ST;
/**
 * Lst6_12_PrintCalendar
 */
public class Lst6_12_PrintCalendar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter full year (eg.2019): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        printMonth(year, month);
    }

    public static void printMonth(int year, int month) {
        printMonthTitle(year, month);
        printMonthBody(year, month);
    }

    public static void printMonthTitle(int year, int month) {
        System.out.println("-----------------------------");
        System.out.println("        " + getMonthName(month) + ", " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "Septemper"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "Decmber";
        }
        return monthName;
    }

    public static void printMonthBody(int year, int month) {
        //Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        //Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        //Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++)
            System.out.print("    ");
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            
            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        // Get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        // Return the start day for month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total += 366;
            else
                total += 365;

        // Add days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++)
            total += getNumberOfDaysInMonth(year, i);
        
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
        return 30;
        else if (month == 2)
        return isLeapYear(year) ? 29 : 28;
        else
        return 0; // if the month is incorrect
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}