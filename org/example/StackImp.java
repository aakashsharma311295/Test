package org.example;

import java.util.Stack;

public class StackImp {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        int max = 0;
        for (int i=0;i<arr.length;i++){
            int newMax = arr[i];
            int smallest = arr[i];
            for (int j = i+1; j<arr.length;j++){
                if (arr[j]<smallest){
                    smallest = arr[j];
                    newMax = Math.max(newMax, (j+1)*smallest);
                }else {

                }
            }
            max = Math.max(max, newMax);
        }

        System.out.println(max);
    }
}
