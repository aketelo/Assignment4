package za.ac.cput;

import Encapsulation_pckg.runPerson;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2017/03/23.
 */
public class runPersonTest
{
    private runPerson p;


    @Test
    public void testRunPerson() throws Exception {
        p = new runPerson();
        Assert.assertEquals("Boniface",p.FnameDetails());

        Assert.assertEquals("Kabaso",p.LnameDetails());

    }


}
