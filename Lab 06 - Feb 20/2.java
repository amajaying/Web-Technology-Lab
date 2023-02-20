import java.util.*;

class Solution{
    public static void main(String args[]){
        int even = 0, odd = 0;
        for(int i = 0; i < args.length; i++){
            if(Integer.parseInt(args[i]) % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
};