package za.ac.cput.Plk.Plk_Violation;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class ClassA {

    private ClassB b;

    public ClassB getB(){
        if (b == null){
            b = new ClassB();
        }
        return b;
    }
    public ClassA(){
    }

    public ClassA(ClassB b){
        this.b = b;
    }

}
