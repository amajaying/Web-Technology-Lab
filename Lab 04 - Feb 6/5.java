// Write a program in Java to take first name and last name from user and print both in
// one line as last name followed by first name.

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String first_name, last_name;
        System.out.print("Enter your first name:");
        first_name = sc.nextLine();
        System.out.print("Enter your last name:");
        last_name = sc.nextLine();
        System.out.print("Your name is: " + last_name + " " + first_name);
    }
};
