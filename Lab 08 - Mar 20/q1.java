import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        Number obj = new Number(n);
        obj.read();
        obj.swap();
        obj.display();
    };
};
 

class Number{
    int n;
    int arr[];
    Number(int num){
        n = num;
        arr = new int[n];
    }
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }
    void swap(){
        int max = arr[0], min = arr[0], maxIndex = 0, minIndex = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }
    void display(){
        System.out.print("The numbers after swapping are: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

