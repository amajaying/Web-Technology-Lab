import General.*;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }
    
    public double tallowance(double basic) {
        double totalEarnings = earnings(basic);
        double tallowance = 0.05 * totalEarnings;
        return tallowance;
    }
}
