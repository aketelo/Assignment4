package za.ac.cput.Srp.Srp_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class RunEmployee {

    public double computePay()
    {
        CalculateSalary c = new CalculateSalary();
        return c.calculatePay(160, 50);
    }

    public String displayPay()
    {
        PrintPayslip p = new PrintPayslip();
        String s = p.prntSlip(160, 50);
        System.out.println(s);
        return s;
    }

}
