import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Kiitian obj = new Kiitian();
        obj.course();
    };
};

abstract class Student{
    int rollNo, regNo;
    abstract void course();
}

class Kiitian extends Student{
    void course(){
        System.out.println("Your course is B.Tech in CSE.");
    }
}

