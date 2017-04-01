package za.ac.cput.PlkTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Plk.Plk_Correction.ClassA;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestPlkC {

    @Test
    public void testPlkCorrection() throws Exception {

        ClassA a = new ClassA();

        Assert.assertEquals(21, a.askNeighborForNum());

    }
}
