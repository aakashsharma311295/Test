package binarysearch;

public class FirstOccurrence {

    static int findFirst(int[] arr, int target){
        int firstIndex = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid] == target){
                firstIndex = mid;
                end = mid-1;
            }else if (target<arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return firstIndex;
    }
    public static void main(String[] args) {
        int[]  arr = {5,5,5,5,6,6,8,9,9,9};
        int x = 5;
        System.out.println(findFirst(arr, x));
    }
}
