package za.ac.cput.Plk.Plk_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class ClassB {

    private ClassC c;

    public ClassB(ClassC c){
        this.c = c;
    }

    public ClassB() {
    }

    public ClassC getC(){
        return c;
    }

    public int getNumberInClassC(){
        if (c == null){
            c = new ClassC();
        }
        return getC().getSomeType();
    }

}
