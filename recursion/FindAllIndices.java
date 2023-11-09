package recursion;

import java.util.ArrayList;
import java.util.List;

public class FindAllIndices {

    private static void approach1(int[] arr, int target, int index, List<Integer> ans) {

        if (index == arr.length) return;

        if (arr[index] == target){
            ans.add(index);
        }
        approach1(arr, target, index+1, ans);
    }

    static List<Integer> approach2(int[] arr, int target, int index){
        if (index == arr.length){
            return new ArrayList<>();
        }
        List<Integer> ans = approach2(arr, target, index+1);

        if (arr[index] == target){
            ans.add(index);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,4};
        int target = 4;
        List<Integer> ans = new ArrayList<>();

        approach1(arr, target, 0, ans);
        System.out.println(ans);
        System.out.println(approach2(arr, target, 0));
    }

}
