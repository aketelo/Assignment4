package za.ac.cput;

import Polymorphisim_pckg.Bird;
import Polymorphisim_pckg.Fish;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2017/03/23.
 */

public class TestPoly {

    private Bird eagle;
    private Fish snoek;
    @Test
    public void testBirdMovement() throws Exception {
        eagle = new Bird();
        Assert.assertEquals("Fly", eagle.move());
    }


    @Test
    public void testFishMovement() throws Exception {
        snoek = new Fish();
        Assert.assertEquals("swim",snoek.move());

    }



}
