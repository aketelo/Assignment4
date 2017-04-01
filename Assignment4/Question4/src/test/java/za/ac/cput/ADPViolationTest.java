package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.ADP_Violation.ClassA;
import za.ac.cput.ADP_Violation.ClassB;

/**
 * Created by student on 2016/03/24.
 */
public class ADPViolationTest {

    @Test
    public void testADPViolationn() throws Exception {
        ClassA a = new ClassA(25,25);
        ClassB b = new ClassB(25,25);

        b.setA(a);
        a.setB(b);

        Assert.assertEquals(100,a.getTotal());
        Assert.assertEquals(100,a.getTotal());
    }
}
