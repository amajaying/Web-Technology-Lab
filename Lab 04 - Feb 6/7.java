//         *
//        * *
//      * * * *
//    * * * * * *

import java.util.*;

class Solution{
    public static void main(String args[]){
        int n = 4;
        int x = 0;
        int one = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i+1; j++){
                if(i==0 && one == 0){
                    System.out.print(" ");
                    one = 1;
                }
                else{
                    System.out.print("  ");
                }
            }
            if(i==0){
                System.out.print("*");
            }
            for(int k=0; k<x; k++){
                System.out.print("* ");
            }
            x=x+2;
            System.out.println();
        }
    }
};