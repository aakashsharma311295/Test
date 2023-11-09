package binarysearch;

public class RotatedArrayTargetSearch {
    static int binarySearch(int[] arr, int target, int start, int end){

        while (start<=end){
//            int mid = (start+end)/2;
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }else if (target < arr[mid]){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    static int approach1(int[] arr, int target){
        int junctionIndex = RotatedArray.binarySearchApproach(arr);
        int start = 0;
        int end = arr.length-1;
        int ans = binarySearch(arr, target, start, junctionIndex-1);
        if (ans!=-1) return ans;
        ans = binarySearch(arr, target, junctionIndex, end);
        return ans;
    }


    static int approach2(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] == target){
                return mid;
            }else if (arr[mid]<arr[end]){
                if (target>arr[mid] && target<=arr[end]){
                    start = mid+1;
                }else {
                    end= mid-1;
                }
            }else {
                if (target<arr[mid] && target>=arr[start]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9,10,11,12,1,2,3,4,5,6,7,8};
        System.out.println(approach2(arr, 81));
    }
}
