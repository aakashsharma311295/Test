package sorting;

import java.util.Arrays;

public class Sort012 {

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid <=high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if (arr[mid] == 1){
                mid++;
            }else {
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,0,0,1,1,2,0,1,0};
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

}
