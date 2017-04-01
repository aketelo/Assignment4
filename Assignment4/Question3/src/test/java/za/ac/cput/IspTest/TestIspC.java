package za.ac.cput.IspTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Isp.Isp_Correction.Bird;
import za.ac.cput.Isp.Isp_Correction.Cat;
import za.ac.cput.Isp.Isp_Correction.Dog;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestIspC {

    @Test
    public void testIspCorrection() throws Exception {

        Bird b = new Bird();
        Dog d = new Dog();
        Cat c = new Cat();


        Assert.assertNotNull(b.fly());
        Assert.assertNotNull(d.bark());
        Assert.assertNotNull(c.run());
        Assert.assertEquals("this bird flies low",b.fly());

    }
}
