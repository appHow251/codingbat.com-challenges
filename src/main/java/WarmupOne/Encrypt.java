package WarmupOne;

public class Encrypt {

    public static String encrypt(String word) {
        String encrypt = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'x' || letter == 'y' || letter == 'z') {
                letter -= 26;// y is 121 in ASCII, so take away 26, and it's now 95, or a
            }
            letter += 3;
            encrypt += letter;
        }
        return encrypt;
    }

    //        char[] charArr = word.toCharArray();
//        String deciphered = "";
//        for (int i = 0; i < charArr.length; i++) {
//             if (charArr[i] == 'x') {
//                deciphered += 'a';
//            }
//            else if (charArr[i] == 'y') {
//                deciphered += 'b';
//            }
//            else if (charArr[i] == 'z') {
//                deciphered += 'c';
//            } else {
//                deciphered += (char) (charArr[i] + 3);
//            }
//        }
//        return deciphered;
//    }
}
