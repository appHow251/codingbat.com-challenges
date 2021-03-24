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
}
