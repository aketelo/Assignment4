package za.ac.cput.ADP_Correction;

/**
 * Created by student on 2017/03/24.
 */
public class ClassA {

    private ClassB b;

    private int num1;
    private int num2;


    public ClassA()
    {

    }

    public ClassA(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ClassB getB()
    {
       return b;
    }

    public void setB(ClassB b)
    {
        this.b =b;
    }

    public int getNum1()
    {
        return num1;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }


    public int getNum2()
    {
        return num2;
    }
}
