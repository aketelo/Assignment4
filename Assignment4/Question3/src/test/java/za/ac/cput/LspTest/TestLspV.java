package za.ac.cput.LspTest;


import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Lsp.Lsp_Violation.Bird;
import za.ac.cput.Lsp.Lsp_Violation.Crow;
import za.ac.cput.Lsp.Lsp_Violation.Ostrich;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestLspV {

    @Test
    public void testLspViolation() throws Exception {

        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(new Bird());
        birdList.add(new Crow());
        birdList.add(new Ostrich());

        Assert.assertEquals(birdList.get(0).fly(), "i can fly");
        Assert.assertEquals(birdList.get(1).fly(), "i am a crow that can fly");
        Assert.assertEquals(birdList.get(2).eat(), "i am an ostrich that can eat");

    }


    private static void letTheBirdsFly(List<Bird> birdList)
    {
        for(Bird b: birdList)
        {
            System.out.println(b.fly());
        }
    }


}
