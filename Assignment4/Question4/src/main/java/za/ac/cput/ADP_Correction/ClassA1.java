package za.ac.cput.ADP_Correction;

/**
 * Created by student on 2017/03/24.
 */
public class ClassA1 {

    private ClassA a;
    private ClassB b;

    public ClassA1()
    {

    }

    public int getTotal()
    {
        return a.getNum1() + a.getNum2() +b.getNum1() +b.getNum2();
    }

    public ClassA getA()
    {
        return a;
    }

    public void setA(ClassA a)
    {
        this.a =a;
    }

    public ClassB getB()
    {
        return b;
    }

    public void setB(ClassB b)
    {
        this.b = b;
    }



}
