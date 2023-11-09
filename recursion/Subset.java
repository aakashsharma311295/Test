package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    static void sum(int[] arr, int index, int sum){
        if (index == arr.length){
            System.out.println(sum);
            return;
        }
        sum(arr, index+1, sum);
        sum(arr, index+1, sum+arr[index]);
    }

    static void printSubsets(int[] arr, int index, List<Integer> subset){
        if (index == arr.length){
            System.out.println(subset);
            return;
        }

        subset.add(arr[index]);
        printSubsets(arr, index+1, subset);
        subset.remove(subset.size()-1);
        printSubsets(arr, index+1, subset);

    }

    public static void main(String[] args) {
        int[] arr = {2,4,5};
//        sum(arr, 0, 0);
        printSubsets(arr, 0, new ArrayList<>());
    }
}
