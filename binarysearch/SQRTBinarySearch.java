package binarysearch;

public class SQRTBinarySearch {

    static int linearApproach(int x){
        int y =0;
        while (y*y <=x){
            y++;
        }
        return y-1;
    }

    static int search(int x){
        int start = 0;
        int end = x;
        int ans = -1;
        while (start<=end){
            int mid = start + (end-start)/2;

            if (mid*mid == x){
                return mid;
            }else if (mid*mid < x){
                start = mid+1;
                ans = mid;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 19;
        System.out.println(search(x));
        System.out.println(linearApproach(x));
    }
}
