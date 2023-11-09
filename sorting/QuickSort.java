package sorting;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] arr, int left, int right){
        int pi = left;
        int smallerElements = 0;
        for (int i =left+1;i<=right;i++){
            if (arr[i]<=arr[pi]){
                smallerElements++;
            }
        }
        pi = left+smallerElements;
        int temp = arr[left];
        arr[left] = arr[pi];
        arr[pi] = temp;

        int i = left;
        int j = right;

        while (i<pi && j>pi){
            while (arr[i]<=arr[pi]){
                i++;
            }
            while (arr[j]>arr[pi]){
                j--;
            }
            if (i<pi && j>pi){
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
                i++;
                j--;
            }
        }
        return pi;
    }
    static void quickSort(int[] arr, int left, int right){
        if (left >= right) return;
        int partitionIndex = partition(arr, left, right);
        quickSort(arr, 0, partitionIndex-1);
        quickSort(arr, partitionIndex+1, right);
    }


    public static void main(String[] args) {
        int[] arr = {4,7,20,2,8,11};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
