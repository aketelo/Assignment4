package za.ac.cput.Dip.Dip_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class SquaredButton implements IButton {

    protected boolean state;
    Lamp l = new Lamp();

    public SquaredButton(){
        this.state = false;
    }

    public String getState()
    {
        if (this.state)
            return "The button is pushed";
        else
            return "The button is released";
    }


    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }



    public String push(){
        this.state = !this.state;
        if(this.state){
            return this.l.turnOn();
        }
        else{
            return this.l.turnOff();
        }
    }

    public String turnOn(){
        return "lamp is ON";
    }


    public String turnOff(){
        return "lamp is OFF";
    }



}
