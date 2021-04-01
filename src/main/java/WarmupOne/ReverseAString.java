package WarmupOne;

public class ReverseAString {

    public static String reverseString(String input) {

        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);
        }
        return newStr;
    }

    // reverse a number
    /**
     * First, the remainder of the num divided by 10 is stored in the variable digit.
     * Now, the digit contains the last digit of num, i.e. 4.
     * digit is then added to the variable reversed after multiplying it by 10.
     * Multiplication by 10 adds a new place in the reversed number.
     * One-th place multiplied by 10 gives you tenth place, tenth gives you
     * hundredth, and so on. In this case, reversed contains 0 * 10 + 4 = 4.
     * num is then divided by 10 so that now it only contains the first three digits: 123.
     * After second iteration, digit equals 3, reversed equals 4 * 10 + 3 = 43 and num = 12
     * After third iteration, digit equals 2, reversed equals 43 * 10 + 2 = 432 and num = 1
     * After fourth iteration, digit equals 1, reversed equals 432 * 10 + 1 = 4321 and num = 0
     * Now num = 0, so the test expression num != 0 fails and while loop exits. reversed
     * already contains the reversed number 4321.
     */

    public static int reversedNumber(int number) {
        int reversed = 0;

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
        System.out.println("Reversed Number: " + reversed);

        return reversed;

    }

}
