package za.ac.cput;

/**
 * Created by student on 2017/03/23.
 */

import Inheritance_pckg.Bird;
import Inheritance_pckg.Dog;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestAnimal
{
    private Dog pitbull;
    private Bird pidgin;


    @Test
    public void testBirdFood() throws Exception {
        pidgin = new Bird();
        Assert.assertEquals("Fish",pidgin.eat());
    }

    @Test
    public void testDogFood() throws Exception {
        pitbull = new Dog();
        Assert.assertEquals("Dog Food",pitbull.eat());
    }
}
