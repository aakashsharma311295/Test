import sorting.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Test11 {

    static boolean checkPrimeNumber(int number){
        if (number == 1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {-1, 4, 6, 2, 8, 4, 7, 12};
        int diff = 5;
        int left = 0;
        int right = 0;
        int longestLength = 0;
        int[] longestSubarray = {0, 0};

        while (right < numbers.length) {
            if (right > 0 && Math.abs(numbers[right] - numbers[right - 1]) <= diff) {
                right++;
            } else {
                left = right;
                right++;
            }

            if (right - left > longestLength) {
                longestLength = right - left;
                longestSubarray[0] = left;
                longestSubarray[1] = right - 1;
            }
        }


        System.out.println(longestSubarray);
    }



}
