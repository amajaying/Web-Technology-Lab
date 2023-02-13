import java.util.*;

class Solution{
    public int subtract(int a, int b) {
        return a - b;
    }
    public float subtract(float a, float b) {
        return a - b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public long subtract(long a, long b) {
        return a - b;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.subtract(10, 5));
        System.out.println(s.subtract(10.5, 5.5));
        System.out.println(s.subtract(10.5f, 5.5f));
        System.out.println(s.subtract(10l, 5l));
    }
};