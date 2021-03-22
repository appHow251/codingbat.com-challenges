package WarmupOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDoubleTest {

    private SumDouble sumDouble;

    @Before
    public void setUp() {
        sumDouble = new SumDouble();

    }

    @Test
    public void sumAandBWhenNotEqual() {
        int a = 5;
        int b = 10;
        int expected = 15;
        int actual = a + b;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doubleSumWhenAandBEquals() {
        int a = 23;
        int b = 23;
        int expected = 92;
        int actual = (a + b) * 2;

        Assert.assertEquals(expected, actual);
    }

}