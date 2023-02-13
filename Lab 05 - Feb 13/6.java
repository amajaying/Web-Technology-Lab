import java.util.*;

class Solution{
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char c='y';
            do{
                System.out.println("*** MENU ***");
                System.out.println("1. Circle");
                System.out.println("2. Square");
                System.out.println("3. Triangle");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter the radius of the circle: ");
                        float r = sc.nextFloat();
                        System.out.println("Area of the circle is: "+(3.14*r*r));
                        break;
                    case 2:
                        System.out.print("Enter the side of the square: ");
                        float s = sc.nextFloat();
                        System.out.println("Area of the square is: "+(s*s));
                        break;
                    case 3:
                        System.out.print("Enter the base of the triangle: ");
                        float b = sc.nextFloat();
                        System.out.print("Enter the height of the triangle: ");
                        float h = sc.nextFloat();
                        System.out.println("Area of the triangle is: "+(0.5*b*h));
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                System.out.print("Do you want to continue? (y/n): ");
                c = sc.next().charAt(0);
            }while(c=='y'||c=='Y');
        }
};