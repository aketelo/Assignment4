package za.ac.cput.OcpTest;

import Config.AppConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Ocp.Ocp_Violation.Person;
import za.ac.cput.Ocp.Ocp_Violation.Staffmember;
import za.ac.cput.Ocp.Ocp_Violation.Student;

/**
 * Created by Scorpian on 2016-03-27.
 */


public class TestOcpV {

    private final Staffmember staff = new Staffmember("RadFord","Burger","8702154869853","0731773160");
    private final Student stud = new Student("Willem","Rothman","9101295335084","0731773160");
    public static Person pers;


    @Before
    public void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        pers = (Person)ctx.getBean("OCPschool");
    }

    @Test
    public void testOcpV() throws Exception {
        Assert.assertEquals("Staff Member:","RadFord"+"Burger"+"8702154869853"+"0731773160", staff.toString());

        Assert.assertEquals("Student:","Willem"+"Rothman"+"9101295335084"+"0731773160" , stud.toString());

        Assert.assertEquals(pers, pers);

    }
}
