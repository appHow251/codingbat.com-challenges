package WarmupOne;

public class Palindrone {

    public static boolean isPalindrome(String input) {

        // Can compare the first half of the String
        // to the second half. Don't need to go through entire string
        if(input.length() >= 0) {
            for (int i = 0; i < (input.length() / 2); i++) {
                if (input.charAt(i) != input.charAt(input.length() - i - 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isNumberPalindrome(int num) {

        int reversed = 0;
        int number = num;

        while(number != 0) {
     // iteration 1: First, the remainder of the num divided by 10 is stored in the variable digit.//
            // Now, the digit contains the last digit of num, i.e. 4. (from 1234)
            // iteration 2: 123 % 10 = 3 (the remainder is 3
            // iteration 3: 12 % 10 = 2 (the remainder is 2)
            // iteration 4: 1 % 10 = 1 (the remainder is 1)
            int digit = number % 10;
            //iteration 1; digit is then added to the variable reversed after multiplying it by 10.
            // iteration 2: "
            // iteration 3: "
            // iteration 4: "
            reversed = reversed * 10 + digit;
            // iteration 1: so 0 * 10 + 4 = 4;
            // iteration 2: so 4 * 10 + 3 = 43; reversed now holds the value 43
            // iteration 3: so 43 * 10 + 2 = 432
            // iteration 4: so 432 * 10 + 1 = 4321
            // iteration 1: number is then divided by 10 so that it gets rid of the last digit(which was a 4), and leaves only 123.
            // iteration 2: number is then divided by 10 so that it gets rid of the 3 at the end, leaving 12
            // iteration 3: number is then divided by 10 so that it gets rid of the 2 at the end, leaving only the 1
            // iteration 4: number is then divided by 10 so the number is zero and the the test expression of the while loop, number
            // != 1 fails and we exit the while loop.
            number /= 10;
        }

        if(num == reversed) {
            return true;
        }
        return false;
    }
    public static boolean isNumberPalindromeUsingLoop(int num) {
        int number = num, reversed = 0;

        for(/* no initialization expression is used*/;/*test expressin is same */number != 0;/*update/increment expression
         soo the number divided by 10 gets rid of the last number leaving only the numbers before it */ number /= 10) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        if(num == reversed) {
            return true;
        }
        return false;

    }
    /**
     * reverse a number using a loop
     *
     *
     * So, after each iteration, the update expression runs which removes the last digit of num.
     *
     * When the for loop exits, reversed will contain the reversed number.
     * class Main {
     *   public static void main(String[] args) {
     *
     *     int num = 1234567, reversed = 0;
     *
//     *  no initialization expression is used; test expression remains the same (num != 0);
//     *  and the update/increment expression contains num /= 10.
//     *     for(;num != 0; num /= 10) {
     *       int digit = num % 10;
     *       reversed = reversed * 10 + digit;
     *     }
     *
     *     System.out.println("Reversed Number: " + reversed);
     *   }
     * }
     */


}
