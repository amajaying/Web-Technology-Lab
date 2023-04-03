import java.util.*;

interface Numbers{
    int process(int x, int y);
}

class Sum implements Numbers{
    public int process(int x, int y){
        return x + y;
    }
}

class Average implements Numbers{
    public int process(int x, int y){
        return (x + y) / 2;
    }
}

class Demo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Sum obj1 = new Sum();
        Average obj2 = new Average();
        System.out.println("Sum: " + obj1.process(x, y));
        System.out.println("Average: " + obj2.process(x, y));
    }
}
