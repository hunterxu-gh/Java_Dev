/*定义五个数，一个最大，一个次大，一个第三大，一个最小，一个次小。
只要找到这五个数，问题就解决了。因为最大乘积只可能是
最大*（次大*第三大） 或者是 最大*（最小*次小）。时间复杂度O(n),
空间复杂度O(1)。PS：这道题输入有问题，题目给的样例是直接给了一组数，
而此时用例先给了一个数的个数n，然后再给了一组数*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
   
public class Pdd1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        int n = Integer.parseInt(bf.readLine());
        String[] str = bf.readLine().split(" ");
        int[] nums=new int[str.length];
        for (int i=0;i<str.length;++i){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(maximumProduct(nums));
    }
    public static long maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max3 = max2;
                max2 = n;
            } else if (n > max3) {
                max3 = n;
            }
   
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return Math.max((long)max1*max2*max3, (long)max1*min1*min2);
    }
}