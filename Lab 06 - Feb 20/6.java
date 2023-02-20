// Find sum of each diagonal (left & right) elements separately of a user entered 3X 3 matrixes in Java.

import java.util.*;

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j)
                    sum1 += arr[i][j];
                if(i + j == 2)
                    sum2 += arr[i][j];
            }
        }
        System.out.println("Sum of left diagonal: " + sum1);
        System.out.println("Sum of right diagonal: " + sum2);
    }
};