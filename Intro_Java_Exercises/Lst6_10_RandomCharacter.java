/**
 * Lst6_10_RandomCharacter
 */
public class Lst6_10_RandomCharacter {

    public static char getRandomChar(char ch1, char ch2) {
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomLowerCaseLetter() {
        return getRandomChar('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomChar('A', 'Z');
    }

    public static char getRandomDigitChar() {
        return getRandomChar('0', '9');
    }

    public static char getRandomChar() {
        return getRandomChar('\u0000', '\uFFFF');
    }

}