package za.ac.cput.SrpTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Srp.Srp_Violation.EmployeViolate;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestSrpV {

    private EmployeViolate employeeV;
    private final double hours = 8;
    private final double rate = 60;
    @Before
    public void setUp() throws Exception {
        employeeV = new EmployeViolate();
    }

    @Test
    public void testSrpViolation() throws Exception {


    }
}
