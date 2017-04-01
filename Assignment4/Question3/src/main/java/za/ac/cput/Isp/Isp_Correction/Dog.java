package za.ac.cput.Isp.Isp_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class Dog implements Runnable, Barkable {

    public String run() {
        return "this dog runs fast";
    }

    public String bark() {
        return "this dog barks funny";
    }

}
