public class q1
{
    public static void main(String[] args)
    {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.checkVal();
    }
}


interface Motor
{
    int capacity = 99;
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