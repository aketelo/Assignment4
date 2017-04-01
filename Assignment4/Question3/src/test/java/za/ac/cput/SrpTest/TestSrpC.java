package za.ac.cput.SrpTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Srp.Srp_Correction.RunEmployee;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestSrpC {

  private RunEmployee obj;
    @Before
    public void setUp() throws Exception {
        obj = new RunEmployee();
    }

    @Test
    public void testComputePay() throws Exception {
        double pay = obj.computePay();
        Assert.assertEquals(8000, pay, 0);

    }

    @Test
    public void testDisplayPay() throws Exception {
        String payslip = obj.displayPay();
        String expected = "Hours worked: 160.0\nRate: 50.0\nTotal salary: 8000.0";
        Assert.assertEquals(expected, payslip);
    }

}
