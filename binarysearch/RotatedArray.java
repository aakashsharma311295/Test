package binarysearch;

public class RotatedArray {

    static int linearSearchApproach(int[] arr){
        int ans = Integer.MAX_VALUE;
        int index = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] < ans){
                ans = arr[i];
                index = i;
            }
        }
        return index;
    }

    static int junctionApproach(int[] arr){
        int i=0;
        while (arr[i]<arr[i+1]){
            i++;
        }
        return ++i;
    }

    static int binarySearchApproach(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int ansIndex = -1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid]>arr[arr.length-1]){
                start = mid+1;
            }else if (arr[mid]<=arr[arr.length-1]){
                ansIndex = mid;
                end = mid-1;
            }
        }
        return ansIndex;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,1};
        System.out.println(linearSearchApproach(arr));
        System.out.println(binarySearchApproach(arr));
        System.out.println(junctionApproach(arr));
    }
}
