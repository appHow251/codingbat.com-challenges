package WarmupOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Diff21Test {

    private Diff21 diff21 = new Diff21();


        @Test
        public void diffWhenNGreaterThan21() {
            Assert.assertEquals(4, diff21.diff21(23));
        }


        @Test
    public void diffWhenNLessThan21() {
        Assert.assertEquals(4, diff21.diff21(17));
    }

}