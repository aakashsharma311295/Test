package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoutSort {

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr){
        int max = max(arr);
        int[] countArr = new int[max+1];

        for (int i =0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        int k =0;
        for (int i =0;i<countArr.length;i++){
            for (int j=0;j<countArr[i];j++){
                arr[k++] = i;
            }
        }
    }

    static int[] optimisedApproach(int[] arr){
        int max = max(arr);
        int[] countArr = new int[max+1];
        for (int i =0;i<arr.length;i++){
            countArr[arr[i]]++;
        }
        for (int i =1;i<arr.length;i++){
            countArr[i]+=countArr[i-1];
        }
        int[] ans = new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            ans[countArr[arr[i]]-1] = arr[i];
            countArr[arr[i]]--;
        }

        return ans;

    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,2,2,5};
//        countSort(arr);
        List<Integer> i = Arrays.asList(1,2,4);

        System.out.println(Arrays.toString(optimisedApproach(arr)));

    }
}
