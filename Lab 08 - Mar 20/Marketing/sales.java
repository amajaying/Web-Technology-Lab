package Marketing;
import General.employee;

class Sales extends Employee{
    public int tallowance(){
        return (int)(0.5 * earnings()));
    }
}