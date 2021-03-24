package WarmupOne;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseAStringTest {

    @Test
    public void reverseString() {
        String expected = "ylimaf";
        String actual = ReverseAString.reverseString("family");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseEmptyString() {
        String expected = "";
        String actual = ReverseAString.reverseString("");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void threeLetterReverse() {
        String expected = "mop";
        String actual = ReverseAString.reverseString("pom");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tenLetterReverse() {
        String expected = "digitdigitdigit";
        String actual = ReverseAString.reverseString("tigidtigidtigid");
        Assert.assertEquals(expected, actual);
    }

}