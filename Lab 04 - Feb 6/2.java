// Program to print the corresponding grade for the given mark using if else statement in Java

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();
        System.out.print("Your grade is: ");
        if(mark >= 90){
            System.out.print("O");
        }
        else if(mark >= 80){
            System.out.print("E");
        }
        else if(mark >= 70){
            System.out.print("A");
        }
        else if(mark >= 60){
            System.out.print("B");
        }
        else if(mark>=50){
            System.out.print("C");
        }
        else if(mark>=40){
            System.out.print("D");
        }
        else{
            System.out.print("Less than D");
        }
    }
};