package WarmupOne;

public class Palindrone {

    public static boolean isPalindrome(String input) {

        // Can compare the first half of the String
        // to the second half. Don't need to go through entire string
        for (int i = 0; i < (input.length() / 2); ++i) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
