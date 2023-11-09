package sorting;

import java.util.Arrays;

public class SelectionSort {

    static void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i;j<arr.length;j++){
                if (arr[j]< min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,4,5,9,8,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
