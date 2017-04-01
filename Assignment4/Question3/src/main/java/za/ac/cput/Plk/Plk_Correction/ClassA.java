package za.ac.cput.Plk.Plk_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class ClassA {

    private ClassB b;

    public ClassA(){
    }

    public ClassA(ClassB b){
        this.b = b;
    }


    public ClassB getB(){
        return b;
    }


    public int askNeighborForNum(){
        if (b == null){
            b = new ClassB();
        }
        return getB().getNumberInClassC();
    }



}
