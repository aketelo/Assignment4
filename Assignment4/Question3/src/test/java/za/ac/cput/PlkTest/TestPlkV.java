package za.ac.cput.PlkTest;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Plk.Plk_Violation.ClassA;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestPlkV {

    @Test
    public void testPlkViolation() throws Exception {

        ClassA a = new ClassA();

        int variable = a.getB().getC().getSomeType();
        Assert.assertEquals(21, variable);

    }
}
