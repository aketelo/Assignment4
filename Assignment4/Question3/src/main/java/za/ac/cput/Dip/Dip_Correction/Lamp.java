package za.ac.cput.Dip.Dip_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class Lamp implements IButton {

    public String turnOn(){
        return "lamp is ON";
    }

    public String turnOff(){
        return "lamp is OFF";
    }

    public String getState() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public String push() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
