package binarysearch;

public class RecursiveBinarySearch {

    static boolean recursiveSolution(int[] arr, int target,  int start, int end){
        int mid = (start + end)/2;
        if (start > end){
            return false;
        }
        if (arr[mid] == target){
            return true;
        }else if (target< arr[mid]){
            return recursiveSolution(arr, target, start, mid-1);
        }else {
            return recursiveSolution(arr, target, mid+1, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int target = 60;
        System.out.println(recursiveSolution(arr, target, 0, arr.length-1));
    }
}
