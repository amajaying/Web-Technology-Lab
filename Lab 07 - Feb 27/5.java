// Write a program to create an Account class containing acc_no, balance as datamembers and disp() to display the details. Inherit it in Person class with all mentioneddata members and functions. Person class also has name and aadhar_no as extra datamembers of its own. Override disp() function. Create 5 persons details

import java.util.*;

class Solution{
    public static void main(String[] args){
        System.out.println("The details are:\n");
        Person p1 = new Person("Ajay",1,1001,10000);
        // p1.name = "Ajay";
        // p1.aadhar_no = 1;
        // p1.acc_no = 1001;
        // p1.balance = 10000;
        p1.disp();
        Person p2 = new Person("Bishal",2,1002,20000);
        // p2.name = "Bishal";
        // p2.aadhar_no = 2;
        // p2.acc_no = 1002;
        // p2.balance = 20000;
        p2.disp();
        Person p3 = new Person("Sampanna", 3, 1003, 30000);
        // p3.name = "Sampanna";
        // p3.aadhar_no = 3;
        // p3.acc_no = 1003;
        // p3.balance = 30000;
        p3.disp();
        Person p4 = new Person("Dikshya", 4, 1004, 40000);
        // p4.name = "Dikshya";
        // p4.aadhar_no = 4;
        // p4.acc_no = 1004;
        // p4.balance = 40000;
        p4.disp();
        Person p5 = new Person("Riya", 5, 1005, 50000);
        // p5.name = "Riya";
        // p5.aadhar_no = 5;
        // p5.acc_no = 1005;
        // p5.balance = 50000;
        p5.disp();
    } 
};

class Account{
    int acc_no;
    int balance;
    void disp(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
};

class Person extends Account{
    String name;
    int aadhar_no;
    Person(String name, int aadhar_no, int acc_no, int balance){
        this.name = name;
        this.aadhar_no = aadhar_no;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    void disp(){
        System.out.println("Name: "+name);
        System.out.println("Aadhar Number: "+aadhar_no);
        System.out.println("Account Number: "+acc_no);
        System.out.println("Balance: "+balance);
        System.out.println("---------------------");
    }
};

