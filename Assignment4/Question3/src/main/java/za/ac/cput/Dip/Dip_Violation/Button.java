package za.ac.cput.Dip.Dip_Violation;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class Button {


    protected Lamp lamp;
    protected boolean isPushed;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void setLamp(Lamp lamp) {
        this.lamp = lamp;
    }

    public boolean isPushed() {
        return isPushed;
    }

    public void setIsPushed(boolean isPushed) {
        this.isPushed = isPushed;
    }

    public String push(){
        this.isPushed = !this.isPushed;
        if(this.isPushed){
            return this.lamp.turnOn();
        }
        else{
            return this.lamp.turnOff();
        }
    }
}
