package sorting;

import java.util.Arrays;

public class InsertionSort {

    static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int counter = i;
            while (counter>=1 && arr[counter]<arr[counter-1]){
                int temp = arr[counter];
                arr[counter] = arr[counter-1];
                arr[counter-1] = temp;
                counter--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
