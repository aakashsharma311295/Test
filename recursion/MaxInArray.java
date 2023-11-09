package recursion;

public class MaxInArray {

    static int max(int[] arr, int index){

        if (index == arr.length-1) return arr[index];


        return Math.max(arr[index], max(arr, index+1));

    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(max(arr, 0));
    }
}
