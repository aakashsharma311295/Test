package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {

    static void bucketSort(float[] arr){
        ArrayList<Float>[] buckets = new ArrayList[arr.length];

        for (int i=0;i< buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for (int i=0;i<arr.length;i++){
            int bucketIndex = (int) arr[i]*arr.length;
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i=0;i<buckets.length;i++){
            for (int j=0;j<buckets[i].size();j++){
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
