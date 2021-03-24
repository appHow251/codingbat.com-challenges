package WarmupOne;

public class ReverseAString {

    public static String reverseString(String input) {

        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);
        }
        return newStr;
    }

}
