/**
 * Lst7_4_CountLetterInArray
 */
public class Lst7_4_CountLetterInArray {

    public static void main(String[] args) {
        char[] chars = createArray();

        System.out.println("The lowercase leetters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurences of each letter are: ");
        displayCounts(counts);
    }

    public static char[] createArray() {
        final int NUMBER_OF_LETTERS = 100;
        char[] letters = new char[NUMBER_OF_LETTERS];

        for (int i = 0; i < NUMBER_OF_LETTERS; i++) {
            letters[i] = Lst6_10_RandomCharacter.getRandomLowerCaseLetter();
        }
        return letters;
    }

    public static void displayArray(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 20 == 0)
                System.out.println();
            System.out.print(array[i] + " ");
        }
    }

    public static int[] countLetters(char[] array) {
        int[] counts = new int[26];

        for (int i = 0; i < array.length; i++)
            counts[array[i] - 'a']++;

        return counts;
    } 

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a'));
            else 
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }
}