import Geometry.*;
class Demo{
    public static void main(String args[]){
        Circle obj = new Circle();
        obj.setRadius(5);
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Area: " + (3.14 * obj.getRadius() * obj.getRadius()));
        System.out.println("Perimeter: " + (2 * 3.14 * obj.getRadius()));
    }
}
