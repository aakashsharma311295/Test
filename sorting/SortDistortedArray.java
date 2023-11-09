package sorting;

import java.util.Arrays;

public class SortDistortedArray {

    static void sortArray(int[] num){
        if(num.length<=1) return;
        int x =-1;
        int y = -1;
        for (int i= 1;i<num.length;i++){
            if (num[i-1]>num[i]){
                if (x == -1){
                    x = i-1;
                    y = i;
                }else {
                    y = i;
                }
            }
        }

        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {10,5,6,7,8,9,3};
        sortArray(num);
        System.out.println(Arrays.toString(num));
    }
}
