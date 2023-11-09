package sorting;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right){
        int[] ans = new int[right-left+1];
        int i = 0;
        int j = mid+1;
        int k = 0;

        while (i<= mid && j<=right){
            if (arr[i]<=arr[j]){
                ans[k] = arr[i];
                k++;
                i++;
            }else {
                ans[k] = arr[j];
                k++;
                j++;
            }
        }

        while (i<=mid){
            ans[k] = arr[i];
            k++;
            i++;
        }

        while (j<=right){
            ans[k] = arr[j];
            k++;
            j++;
        }
        for (i=left;i<=right;i++){
            arr[i] = ans[i-left];
        }
    }

    static void mergeSort(int[] arr, int left, int right){

        if (left == right){
            return ;
        }
        int mid = (left + right)/2;

        mergeSort(arr, 0, mid);
        mergeSort(arr, mid+1, right);
        merge(arr, left, mid, right);

    }

    public static void main(String[] args) {
        int[] arr = {4,7,20,2,8,11};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
