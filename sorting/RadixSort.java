package sorting;

import java.util.Arrays;

public class RadixSort {


    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr, int place){
        int[] countArr = new int[10];
        for (int i=0;i<arr.length;i++){
            countArr[(arr[i]/place)%10]++;
        }

        for (int i=1;i<countArr.length;i++){
            countArr[i]+= countArr[i-1];
        }
        int[] ans = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            ans[countArr[(arr[i]/place)%10]-1] = arr[i];
            countArr[(arr[i]/place)%10]--;
        }

        for (int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }

    }
    static void radixSort(int[] arr){
        int max = findMax(arr);

        for (int place = 1; max/place>0  ;place*=10){
            countSort(arr, place);
        }
    }


    public static void main(String[] args) {
        int[] arr = {43, 453, 626, 894, 0, 3};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
