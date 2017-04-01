package za.ac.cput.Srp.Srp_Correction;

/**
 * Created by Scorpian on 2017-03-27.
 */
public class PrintPayslip {

    public String prntSlip(double hours, double rate)
    {
        String s = String.format("Hours worked: " + hours + "\nRate: " + rate + "\nTotal salary: " + CalculateSalary.calculatePay(hours, rate));
        return s;
    }

}
