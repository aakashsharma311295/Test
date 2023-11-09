package org.example;

import java.io.IOException;
import java.io.Serializable;

public class LanguageFundamentals {
//    static int i;
    public final synchronized strictfp static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,8,9};
        System.out.println(binarySearch(arr,0, arr.length-1, 5));
    }

    static int binarySearch(int[] arr, int l, int r, int x){
        if (r>=l){
            int mid = l+(r-1)/2;
            if(arr[mid] == x){
                return mid;
            }
            if (arr[mid]>x){
                return binarySearch(arr,l, mid+1,x);
            }
            return binarySearch(arr, mid+1, r, x);
        }
        return -1;
    }


}

