package binarysearch;

public class BinarySearch {

    static boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return true;
            }else if (target < arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearch(arr, 16));
    }
}
