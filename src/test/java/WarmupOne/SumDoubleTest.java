package WarmupOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumDoubleTest {

    private SumDouble sumDouble = new SumDouble();

    @Test
    public void sumAandBWhenNotEqual() {
        Assert.assertEquals(20, sumDouble.sumDouble(15, 5));
    }

    @Test
    public void doubleSumWhenAandBEquals() {
        Assert.assertEquals(40, sumDouble.sumDouble(10, 10));

    }

}