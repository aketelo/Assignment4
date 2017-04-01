package za.ac.cput.DipTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Dip.Dip_Violation.Button;
import za.ac.cput.Dip.Dip_Violation.Lamp;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestDipV {

    @Test
    public void testDipViolation() throws Exception {

        Lamp lamp = new Lamp();
        Button button = new Button(lamp);
        Assert.assertEquals("lamp is ON",button.push());
        Assert.assertEquals("lamp is OFF",button.push());



    }
}
