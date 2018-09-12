import java.util.Scanner;

/**
 * Ch2_13_CompoundVal
 * 以习题为例的强化版基金定投利润计算器：
 * 1. 用户输入：
 *  - 近7日年化利率
 *  - 每月存款金额
 *  - 期望时长（月为单位）
 * 
 * 2. 用Loop计算每个月的余额
 */
public class Ch2_13_CompoundVal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the interest rate: ");
        double interRate = input.nextDouble();
        System.out.print("Enter the monthly saving amount: ");
        double amounts = input.nextDouble();
        System.out.print("Enter the number of months you want last: ");
        double months = input.nextDouble();

        double outcome = 0;
        //不定投的情况
        //outcome = outcome + amounts + Math.pow((1 + interRate), months);
        for(int i = 0; i < months; i++) {
            outcome = (amounts + outcome) * (1 + interRate);
        }
        System.out.println("The outcome is " + outcome);
        
    }
}