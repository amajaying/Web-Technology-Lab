import java.util.*;

class Solution{
    class A{
        static int count = 0;
        A(){
            count++;
        }
    }
    public static void main(String args[]){
        Solution s = new Solution();
        A a1 = s.new A();
        A a2 = s.new A();
        A a3 = s.new A();
        A a4 = s.new A();
        System.out.println("No. of objects created: " + A.count);
    }
};