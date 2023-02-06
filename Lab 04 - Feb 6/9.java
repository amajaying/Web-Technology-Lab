// print prime factors of a number
import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        System.out.print("The prime factors are: ");
        for(int i=2; i<=num; i++){
            if(num%i == 0){
                int flag = 0;
                for(int j=2; j<i; j++){
                    if(i%j == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0){
                    System.out.print(i + " ");
                }
            }
        }


    }
};