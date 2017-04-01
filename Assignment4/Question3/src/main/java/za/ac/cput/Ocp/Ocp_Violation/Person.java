package za.ac.cput.Ocp.Ocp_Violation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class Person {

    List<Object> persons = new ArrayList<Object>();

    public void createPerson(Object person)
    {
        persons.add(person);

    }

    public void displayPerson()
    {
        for(Object person: persons)
        {
            if(person instanceof Staffmember)
                ((Staffmember)person).toString();

            if(person instanceof Student)
                ((Student)person).toString();
        }




    }

}
