package Intro_Java_Exercises;

/**
 * CH7_OperationsOnArray2
 */
public class CH7_OperationsOnArray2 {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] reverseArray(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--)
            result[j] = list[i];
            
        return result;
    }

    public static int[] shuffleArray(int[] array) {
        //int index = (int)(Math.random() * array.length);

        for (int i = 0; i < array.length; i++) {
            int index = (int)(Math.random() * array.length);
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];

        //for (int i = 0; i < sourceArray.length; i++)
          //  targetArray[i] = sourceArray[i];

        System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    
        //reverseArray(targetArray);
        printArray(shuffleArray(targetArray));
    }
}