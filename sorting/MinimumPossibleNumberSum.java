package sorting;

import java.util.Arrays;

public class MinimumPossibleNumberSum {

    public static void main(String[] args) {
        int[] arr = {5,3,1,2,5};  //1,2,3,4,5
        Arrays.sort(arr);
        int min = 0;
        for (int i=0;i<arr.length;i++){
            min = min*10+arr[i];
        }



        System.out.println(min);
        int index = arr.length-1;
        while (arr[index] == arr[index-1]){
            index--;
        }
        int temp = arr[index];
        arr[index] = arr[index-1];
        arr[index-1] = temp;
        int secondMin = 0;
        for (int i=0;i<arr.length;i++){
            secondMin = secondMin*10+arr[i];
        }
        System.out.println(secondMin);

        System.out.println(min+secondMin);
    }
}
