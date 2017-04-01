package za.ac.cput.ADP_Violation;

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

    public int getTotal()
    {
        return num1 + num2 + b.getNum1() + b.getNum2();
    }

    public int getNum1()
    {
        return num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum1()
    {
        this.num1 = num1;
    }

    public void setNum2(int num2)
    {
        this.num2 = num2;
    }

    public void setB(ClassB b)
    {
        this.b = b;
    }
}
