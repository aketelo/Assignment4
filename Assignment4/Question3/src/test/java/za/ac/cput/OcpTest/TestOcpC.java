package za.ac.cput.OcpTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import Config.AppConfig;
import za.ac.cput.Ocp.Ocp_Correction.OCPSchoolInterface;
import za.ac.cput.Ocp.Ocp_Correction.StaffmemberImpl;
import za.ac.cput.Ocp.Ocp_Correction.StudentImpl;
import za.ac.cput.Ocp.Ocp_Violation.Person;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestOcpC {

    public static OCPSchoolInterface ocpInt;
    final StaffmemberImpl staff = new StaffmemberImpl("RadFord","Burger","8702154869853","0731773160");
    private final StudentImpl stud = new StudentImpl("Willem","Rothman","9101295335084","0731773160");
    public static Person pers;

    @Before
    public void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ocpInt = (OCPSchoolInterface)ctx.getBean("OCPCorrectschool");

    }

    @Test
    public void testOcpC() throws Exception {
        Assert.assertEquals("Staff Member:","RadFord"+"Burger"+"8702154869853"+"0731773160", staff.toString());

        Assert.assertEquals("Student:","Willem"+"Rothman"+"9101295335084"+"0731773160" , stud.toString());

        Assert.assertEquals(pers, pers);

    }
}
