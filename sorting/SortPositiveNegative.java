package sorting;

import java.util.Arrays;

public class SortPositiveNegative {

    private static void sortPosNeg(int[] num) {

        int left = 0;
        int right = num.length-1;

        while (left<=right){
            while (num[left]<0){
                left++;
            }
            while (num[right]>=0){
                right--;
            }
            if (left<right){
                int temp = num[left];
                num[left] = num[right];
                num[right]= temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {-13,20,7,0,-4,-13,11,-5,-13};
        sortPosNeg(num);
        System.out.println(Arrays.toString(num));
    }

}
