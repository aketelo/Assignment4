package za.ac.cput.LspTest;


import org.junit.Test;
import za.ac.cput.Lsp.Lsp_Correction.Bird;
import za.ac.cput.Lsp.Lsp_Correction.Crow;
import za.ac.cput.Lsp.Lsp_Correction.FlightBird;
import za.ac.cput.Lsp.Lsp_Correction.NonFlight;

import org.junit.Assert;
/**
 * Created by Scorpian on 2016-03-27.
 */
public class TestLspC {
    @Test
    public void testLspCorrection() throws Exception {

            Bird b = new Bird();
            Bird non = new NonFlight();
            Bird flight = new FlightBird();
            Crow crow = new Crow();

           Assert.assertEquals("i can fly",flight.fly() );
            Assert.assertEquals("this bird flies low",non.fly());
            Assert.assertEquals("i can eat",crow.eat());



    }
}
