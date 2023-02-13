import java.util.*;

class Solution{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int roll[] = new int[n];
        String name[] = new String[n];
        float cgpa[] = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the roll of student "+(i+1)+": ");
            roll[i] = sc.nextInt();
            System.out.print("Enter the name of student "+(i+1)+": ");
            name[i] = sc.next();
            System.out.print("Enter CGPA of student " +(i+1)+": ");
            cgpa[i] = sc.nextFloat();
        }
        int min = 0;
        for (int i = 0; i < n; i++) {
            if (cgpa[i] < cgpa[min]) {
                min = i;
            }
        }
        System.out.println(name[min]+" has the lowest cgpa of "+cgpa[min]+"");
    }
};