// check if user entered number is palindrome or not.

import java.util.*;
 
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rev = 0, rem, temp;
        System.out.print("Enter the number:"); 
        num = sc.nextInt();
        temp = num;
        while(num > 0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(temp == rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
};