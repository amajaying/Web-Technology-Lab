public class q1
{
    public static void main(String[] args)
    {
        WashingMachine machine = new WashingMachine();
        machine.run();
        machine.consume();
        machine.checkVal();
    }
}


interface Motor
{
    int capacity = 3794;
    void run();
    void consume();
}

class WashingMachine implements Motor
{
    public void run()
    {
        System.out.println("Washing Machine is running");
    }
    public void consume()
    {
        System.out.println("Washing Machine is consuming");
    }
    void checkVal(){
        System.out.println("Capacity of Washing Machine is: " + capacity);
    }
}