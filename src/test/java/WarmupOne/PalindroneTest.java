package WarmupOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindroneTest {


    @Test
    public void isPalindromeWithOneCharacter() {
        assertEquals(true, Palindrone.isPalindrome("z"));
    }

    @Test
    public void isPalindromeWithTwoCharacters() {
        assertEquals(true, Palindrone.isPalindrome("zz"));
    }

    @Test
    public void isPalindromeWithThreeCharacters() {
        assertEquals(true, Palindrone.isPalindrome("mom"));
    }

    @Test
    public void isNotPalindromeWithTwoDifferentCharacters() {
        assertEquals(false, Palindrone.isPalindrome("zy"));
    }

    @Test
    public void isApalindrome() {
        assertEquals(true, Palindrone.isPalindrome("familyandfriendssdneirfdnaylimaf"));
    }

    @Test
    public void noNotPalindrome() {
        assertEquals(false, Palindrone.isPalindrome("nopenotgonnawork"));
    }

    @Test
    public void isNumPalindromeTest() {assertEquals(true, Palindrone.isNumberPalindrome(121));}

    @Test
    public void isNumPalindromeTest2() {assertEquals(true, Palindrone.isNumberPalindrome(1234554321));}

    @Test
    public void isNumPalindromeNoTest() {assertEquals(false, Palindrone.isNumberPalindrome(1237895421));}

    @Test
    public void isNumPalindromUsingLoop() {
        assertEquals(true, Palindrone.isNumberPalindromeUsingLoop(1234554321));
    }

}
