package za.ac.cput.Ocp.Ocp_Correction;


import java.util.*;
/**
 * Created by Scorpian on 2017-03-27.
 */
public class PersonCorrection {

    List<OCPSchoolInterface> ocp = new ArrayList <OCPSchoolInterface>();

    public void createPerson(OCPSchoolInterface ocps)
    {
        ocp.add(ocps);
    }

    public void displayPerson()
    {
        for(OCPSchoolInterface ocpschool : ocp)
        {
            ocpschool.toString();
        }
    }

}
