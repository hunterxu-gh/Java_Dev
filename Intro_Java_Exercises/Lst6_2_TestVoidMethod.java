/**
 * Lst_6_2_TestVoidMethod
 */
public class Lst_6_2_TestVoidMethod {
    public static void printGrade(double score) {
        if (score < 0 || score > 100){
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90)
            System.out.println("A");
        else if (score >= 80)
            System.out.println("B");
        else if (score >=70)
            System.out.println("C");
        else if (score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
        
    }
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);
        System.out.print("The grade is ");
        printGrade(58.5);
        System.out.print("The grade is ");
        printGrade(158.5);
    }
}