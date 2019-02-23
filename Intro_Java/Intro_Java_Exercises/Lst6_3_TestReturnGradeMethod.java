package Intro_Java_Exercises;

/**
 * Lst_6_3_TestReturnGradeMethod
 */
public class Lst_6_3_TestReturnGradeMethod {

    public static char getGrade(double score) {
        if (score >= 90)
            return 'A';
        else if (score >= 80)
            return 'B';
        else if (score >= 80)
            return 'C';
        else if (score >= 70)
            return 'D';
        else if (score >= 60)
            return 'E';
        else
            return 'F';
    }
    public static void main(String[] args) {
        System.out.println("The grade is " + getGrade(68.5));
        System.out.println("The grade is " + getGrade(58.5));
    }
}