// Write a program in java to define a class Shape which has data member „area‟and amember function showArea(). Derive two classes Circle and Rectangle from Shapeclass. Add appropriate data members and member functions to calculate and displaythe area of Circle and Rectangle.

import java.util.*;

class Solution{
    public static void main(String[] args){
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(5,10);
        c.showArea();
        r.showArea();
    }
};

class Shape{
    int area;
    void showArea(){
        System.out.println("Area: "+area);
    }
};

class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    void showArea(){
        area = (int)(3.14*r*r);
        System.out.println("Area of Circle: "+area);
    }
};

class Rectangle extends Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    void showArea(){
        area = l*b;
        System.out.println("Area of Rectangle: "+area);
    }
};

