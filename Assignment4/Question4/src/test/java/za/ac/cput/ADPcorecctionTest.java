package za.ac.cput;


import junit.framework.Assert;
import za.ac.cput.ADP_Correction.ClassA;
import za.ac.cput.ADP_Correction.ClassA1;
import za.ac.cput.ADP_Correction.ClassB;

/**
 * Created by student on 2016/03/24.
 */
public class ADPcorecctionTest {
    private ClassA1 a1;

    @org.junit.Test
    public void testADPcorrection() throws Exception {

        a1 = new ClassA1();
        a1.setA(new ClassA(25,25));
        a1.setB(new ClassB(25,25));

        Assert.assertEquals(100,a1.getTotal());

    }
}
