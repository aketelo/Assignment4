package za.ac.cput.ADP_Violation;

/**
 * Created by student on 2017/03/24.
 */
public class ClassB {

    private ClassA a;
    private int num1;
    private int num2;

    public ClassB(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public ClassB()
    {

    }


    public ClassA getA()
    {
        return a;
    }

    public void setA(ClassA a)
    {
        this.a = a;
    }

    public int getNum1()
    {
      return num1;
    }

    public int getNum2()
    {
        return num2;
    }

    public void setNum2()
    {
        this.num2 = num2;
    }

    public int getTotal()
    {
        return num1 + num2 +a.getNum1() +a.getNum2();
    }

    public void setA()
    {
        this.a = a;
    }

    public void setNum1(int num1)
    {
        this.num1 = num1;
    }



}
