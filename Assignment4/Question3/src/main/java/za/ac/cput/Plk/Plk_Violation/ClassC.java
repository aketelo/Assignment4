package za.ac.cput.Plk.Plk_Violation;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class ClassC {

    private int someType = 21;   // default value

    public ClassC() {
    }

    public ClassC(int someType) {
        this.someType = someType;
    }

    public int getSomeType() {
        return someType;
    }

    public void setSomeType(int someType) {
        this.someType = someType;
    }
}
