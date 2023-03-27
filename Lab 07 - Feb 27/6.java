// Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super.

import java.util.*;

class Solution{
    public static void main(String[] args){
        C c = new C(1,2,3);
        c.showA();
        c.showB();
        c.showC();
    }
};

class A{
    int aa;
    A(int a){
        aa = a;
    }
    void showA(){
        
        System.out.println("A: "+aa);
    }
};

class B extends A{
    int bb;
    B(int a,int b){
        super(a);
        bb = b;
    }
    void showB(){
        System.out.println("B: "+bb);
    }
};

class C extends B{
    int cc;
    C(int a,int b,int c){
        super(a,b);
        cc = c;
    }
    void showC(){
        System.out.println("C: "+cc);
    }
};

