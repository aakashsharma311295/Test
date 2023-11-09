package recursion;

public class Frog̋Jump {

    static int calc(int[] arr, int index){

        if (index == arr.length-1) return 0;
//        if (index == arr.length-2) return Math.abs(arr[index]-)

        int step1Cost = Math.abs(arr[index]-arr[index+1]) + calc(arr, index+1);
        int step2Cost = Math.abs(arr[index]-arr[index+2]) + calc(arr, index+2);

        return Math.min(step1Cost, step2Cost);


    }

    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(calc(arr, 0));
    }
}
