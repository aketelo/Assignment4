package za.ac.cput.Plk.Plk_Violation;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class ClassB {

    private ClassC c;

    public ClassB() {
    }

    public ClassC getC(){
        if(c == null){
            c = new ClassC();
        }
        return c;
    }

    public ClassB(ClassC c){
        this.c = c;
    }


}
