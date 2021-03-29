package WarmupOne;

public class Palindrone {

    public static boolean isPalindrome(String input) {

        // Can compare the first half of the String
        // to the second half. Don't need to go through entire string
        if((input.length() >= 0) && input.length() < 10)
        for (int i = 0; i < (input.length() / 2); ++i) {
            if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNumberPalindrome(int num) {
        /*
        In this program,

First, given number (num)'s value is stored in another
integer variable, startingNum. This is because,
we need to compare the values of reversed number and original number at the end.
Then, a while loop is used to loop through num until it is equal to 0.
On each iteration, the last digit of num is stored in the remainder.
Then, the remainder is added to reversedInteger such that it is added
to the next place value (multiplication by 10).
Then, the last digit is removed from num after division by 10.
Finally, reversedNum and startingNum are compared. If equal, it is a palindrome number.
If not, it isn't.
         */
        int remainder = 0;
        int startingNum = 0;
        int reversedNum = 0;
        startingNum = num;
        while(num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        // if num and reversedNum are equal, it's a palidnrome
        if(startingNum == reversedNum) {
            return true;
        }
        return false;
    }
}
