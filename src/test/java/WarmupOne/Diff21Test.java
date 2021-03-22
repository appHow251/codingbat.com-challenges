package WarmupOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Diff21Test {

    private Diff21 diff21;

    @Before
    public void setUp() {
        diff21 = new Diff21();

    }

    @Test
    public void diffWhenNLessThan21() {
        int n = 19;

        int expected = 2;
        int actual = 21 - n;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diffWhenNGreaterThan21() {
        int n = 35;

        int expected = 14;
        int actual = n-21;

        Assert.assertEquals(expected, actual);
    }

}