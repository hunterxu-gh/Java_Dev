/**
 * Lst18_3_RecursivePalindrome
 */
public class Lst18_3_RecursivePalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("moon"));
        System.out.println(isPalindrome("noon"));
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("a"));
    }
/*
    public static boolean isPalidrome(String s) {
        if (s.length() <= 1) // Base case 
            return true;
        else if (s.charAt(0) != s.charAt(s.length() -1)) // Base case
            return false;
        else
            return isPalidrome(s.substring(1, s.length() - 1)); // Contract
    }
*/
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
    
    private static boolean isPalindrome(String s, int low, int high) {
        if (low >= high)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else 
            return isPalindrome(s, low + 1, high - 1);
    }

}