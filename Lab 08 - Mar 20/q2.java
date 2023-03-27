import java.util.*;


class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the sheet in ft: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the sheet in ft: ");
        int b = sc.nextInt();
        System.out.print("Enter the height of the box in ft: ");
        int h = sc.nextInt();
        TwoD obj1 = new TwoD(l, b);
        ThreeD obj2 = new ThreeD(l, b, h);
        System.out.println("The cost of the sheet is Rs. " + obj1.cost());
        System.out.println("The cost of the box is Rs. " + obj2.cost());
    };
};

class TwoD{
    int l, b;
    TwoD(int len, int br){
        l = len;
        b = br;
    }
    int cost(){
        return 40 * l * b;
    }
}
 
class ThreeD extends TwoD{
    int h;
    ThreeD(int l, int b, int hei){
        super(l, b);
        h = hei;
    }
    int cost(){
        return 60 * l * b * h;
    }
}

