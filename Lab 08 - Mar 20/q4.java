import Marketing.Sales;

public class Main {
    public static void main(String[] args) {
        Sales salesperson = new Sales(1001, "John Doe");
        double basicSalary = 50000;
        double totalEarnings = salesperson.earnings(basicSalary);
        double tallowance = salesperson.tallowance(basicSalary);
        System.out.println("Emp ID: " + salesperson.getEmpid());
        System.out.println("Emp Name: " + salesperson.getEname());
        System.out.println("Total Earnings: " + totalEarnings);
        System.out.println("Travel Allowance: " + tallowance);
    }
}
