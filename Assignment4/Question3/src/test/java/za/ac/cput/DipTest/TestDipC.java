package za.ac.cput.DipTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Dip.Dip_Correction.Lamp;
import za.ac.cput.Dip.Dip_Correction.SquaredButton;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestDipC {

    @Test
    public void testDipCorrection() throws Exception {

        Lamp lamp = new Lamp();

        SquaredButton button = new SquaredButton();

       Assert.assertEquals("lamp is ON",button.push());
        Assert.assertEquals("lamp is OFF",button.push());

    }
}
