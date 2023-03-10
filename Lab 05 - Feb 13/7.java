import java.util.*;

class Number{   
    int n;
    int arr[];
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void swap(){
        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        int temp = arr[max];
        arr[max] = arr[min];
        arr[min] = temp;
    }
    public void display(){
        System.out.println("The array after swapping is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Number obj = new Number();
        obj.read();
        obj.swap();
        obj.display();
    }
};