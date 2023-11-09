package sorting;

public class KthSmallestElement {

    static int approach1(int[] arr, int k){
        for (int i=0;i<k;i++){
            int counter = i;
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j=i ;j<arr.length;j++){
                if (arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {5,2,1,3,4};
        System.out.println(approach1(arr, 3));
    }
}
