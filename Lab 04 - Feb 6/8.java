// a  number is prime or not

import java.util.*;

class Solution{
    public static void main(String args[]){
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        int flag = 0;
        for(int i=2; i<number; i++){
            if(number%i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
};