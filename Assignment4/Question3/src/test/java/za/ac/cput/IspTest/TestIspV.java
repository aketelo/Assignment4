package za.ac.cput.IspTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Isp.Isp_Violation.Bird;
import za.ac.cput.Isp.Isp_Violation.Cat;
import za.ac.cput.Isp.Isp_Violation.Dog;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestIspV {

    @Test
    public void testIspViolation() throws Exception {

        Bird b = new Bird();
        Dog d = new Dog();
        Cat c = new Cat();


        Assert.assertNull(c.bark());
        Assert.assertNull(d.fly());
        Assert.assertEquals("this cat runs slow",c.run());

    }
}
