package sorting;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MoveZeroesToEnd {

    static int[] approach1(int[] arr){
        int[] ans = new int[arr.length];

        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=0){
                ans[index++] = arr[i];
            }
        }
        return ans;
    }

    static void approach2(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j = 0; j<arr.length-i-1; j++){
                if (arr[j] ==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,0,2,0,0,4,1,3,0};
//        System.out.println(Arrays.toString(approach1(arr)));
        approach2(arr);
        System.out.println(Arrays.toString(arr));

        Set<Integer> s = new LinkedHashSet<>();
//        s.
    }
}
