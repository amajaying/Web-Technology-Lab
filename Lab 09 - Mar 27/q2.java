
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter another string: ");
        String str2 = sc.nextLine();
        System.out.println("1. Change the case of the string");
        System.out.println("2. Reverse the string");
        System.out.println("3. Compare two strings");
        System.out.println("4. Insert one string into another string");
        while(flag){
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Original string: " + str);
                System.out.println("String in upper case: " + str.toUpperCase());
                System.out.println("String in lower case: " + str.toLowerCase());
                break;
            case 2:
                System.out.println("Original string: " + str);
                System.out.print("Reversed string: ");
                for(int i=str.length()-1; i>=0; i--){
                    System.out.print(str.charAt(i));
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Original string: " + str);
                System.out.println("String to compare: " + str2);
                System.out.println("Are the strings equal? " + str.equals(str2));
                break;
            case 4:
                System.out.println("Original string: " + str);
                System.out.println("String to insert: " + str2);
                System.out.println("Enter the index to insert: ");
                int index = sc.nextInt();
                System.out.println("String after insertion: " + str.substring(0, index) + str2 + str.substring(index));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        System.out.println("Want to perform more ? (Yes:1 /No:0)");
        int ch = sc.nextInt();
        if(ch==1){
            flag = true;
        }
        else{
            flag = false;
    }
    }
    }
}