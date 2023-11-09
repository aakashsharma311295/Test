package recursion;

public class FindLastIndex {

    static int lastIndex(int[] arr, int target, int index){

        if (index == -1) return -1;

        if (arr[index] == target) return index;

        return lastIndex(arr, target, index-1);
    }

    static int lastIndex2(int[] arr, int target, int index){

        if (index == arr.length) return -1;

        int  lastIndex = lastIndex2(arr, target, index+1);
        if (lastIndex == -1){
            if (arr[index] == target){
                return index;
            }else {
                return lastIndex;
            }
        }else {
            return lastIndex;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,4};
        int target = 4;
        System.out.println(lastIndex(arr,  target,arr.length-1));
        System.out.println(lastIndex2(arr,  target,0));

    }
}
