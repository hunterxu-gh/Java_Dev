/**
 * Lst6_11_TestRandomChar
 */
public class Lst6_11_TestRandomChar {

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175; // the number of total chars
        final int CHARS_PER_LINE = 25; // 25 chars per line

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = Lst6_10_RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}