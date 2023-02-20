// Find the no. of occurrence of each element in an user entered list of nos.

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] count = new int[n];
        for(int i = 0; i < n; i++)
            count[i] = 1;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    count[i]++;
                    arr[j] = -1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] != -1)
                System.out.println(arr[i] + " " + count[i]);
        }
    }
};