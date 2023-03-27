// Illustrate the execution of constructors in multi-level inheritance with threeJava classes – plate(length, width), box(length, width, height), wood box(length, width, height, thick)

import java.util.*;

class Solution
{
    public static void main(String[] args)
    {
        WoodBox wb = new WoodBox(10, 20, 30, 40); 
        System.out.println("\nLength = " + wb.length);
        System.out.println("Width = " + wb.width);
        System.out.println("Height = " + wb.height);
        System.out.println("Thickness = " + wb.thick);
    }
};

class Plate
{
    int length, width;
    Plate(int x, int y)
    {
        System.out.println("Plate constructor");
        length = x;
        width = y;
    }
}


class Box extends Plate
{
    int height;
    Box(int x, int y, int z)
    {
        super(x, y);
        System.out.println("Box constructor");
        height = z;
    }
}

class WoodBox extends Box
{
    int thick;
    WoodBox(int x, int y, int z, int t)
    {
        super(x, y, z);
        System.out.println("WoodBox constructor");
        thick = t;
    }
}



