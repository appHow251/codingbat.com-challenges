package WarmupOneTest;

import WarmupOne.SleepIn;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SleepInTest {


    private SleepIn sleepIn;

    @Before
    public void setUp() {
        sleepIn = new SleepIn();

    }

    @Test
    public void isSleepingIn() {
        Boolean weekdayActual = true;
        Boolean vacationActual = false;

        Assert.assertFalse(sleepIn.sleepIn(weekdayActual, vacationActual));
    }

    @Test
    public void isSleepingIn2() {
        Boolean weekdayActual = true;
        Boolean vacationActual = true;
        Assert.assertTrue(sleepIn.sleepIn(weekdayActual, vacationActual));

    }

    @Test
    public void isLeepingIn3() {
        Boolean weekdayActual = false;
        Boolean vacationActual = false;
        Assert.assertTrue(sleepIn.sleepIn(weekdayActual, vacationActual));
    }
}
