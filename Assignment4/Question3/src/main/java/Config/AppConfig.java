package Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import za.ac.cput.Ocp.Ocp_Correction.*;

/**
 * Created by Scorpian on 2016-03-27.
 */

import za.ac.cput.Ocp.Ocp_Violation.Person;
import za.ac.cput.Ocp.Ocp_Violation.Staffmember;
import za.ac.cput.Ocp.Ocp_Violation.Student;


@Configuration
public class AppConfig {

    @Bean(name ="OCPschool")
    public Person getOCPStaff(){


        return new Staffmember("RadFord","Burger","8702154869853","0731773160");
    }

    public Person getOCPStudent(){


        return new Student("Willem","Rothman","9101295335084","0731773160");
    }

    @Bean(name="OCPCorrectschool")
    public OCPSchoolInterface getOCPStaffCorrect()
    {
        return (OCPSchoolInterface) new StaffmemberImpl("RadFord","Burger","8702154869853","0731773160");
    }
    public OCPSchoolInterface getOCPStudentCorrect()
    {
        return (OCPSchoolInterface) new Student("Willem","Rothman","9101295335084","0731773160");
    }

}
