package WarmupOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonkeyTroubleTest {

    private MonkeyTrouble monkeyTrouble;

    @Before
    public void setUp() {
        monkeyTrouble = new MonkeyTrouble();

    }

    @Test
    public void isInTroubleASleepingBNotSmiling() {
        Boolean aIsSmiling = true;
        Boolean bIsSmiling = false;

        Assert.assertFalse(monkeyTrouble.monkeyTrouble(aIsSmiling, bIsSmiling));

    }

    @Test
    public void isInTroubleASleepingAndBSmiling() {
        Boolean aIsSmiling = true;
        Boolean bIsSmiling = true;

        Assert.assertTrue(monkeyTrouble.monkeyTrouble(aIsSmiling, bIsSmiling));
    }

    @Test
    public void isInTroubleNeitherSmiling() {
        Boolean aIsSmiling = false;
        Boolean bIsSmiling = false;

        Assert.assertTrue(monkeyTrouble.monkeyTrouble(aIsSmiling, bIsSmiling));
    }


}