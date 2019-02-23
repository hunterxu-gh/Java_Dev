import java.util.Arrays;
import java.math.*;
/**
 * Lst13_8_SortComparableObj
 */
public class Lst13_8_SortComparableObj {

    public static void main(String[] args) {
        String[] cities = {"Beijing", "Shanghai", "Guangzhou"};
        java.util.Arrays.sort(cities);

        for (String s : cities) 
            System.out.print(s + " "); // 注意for-each的用法
        System.out.println();

        BigInteger[] hugeNumbers = {new BigInteger("23242342344234234234"), //使用对象【数组】的创建方法
                                    new BigInteger("3524525234523452"),
                                    new BigInteger("5364546346")};

        java.util.Arrays.sort(hugeNumbers);

        for (BigInteger i : hugeNumbers)
            System.out.print(i + " ");
        System.out.println();

    }
}