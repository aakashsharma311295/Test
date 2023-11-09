package queues;

import java.util.*;

public class Turnstile {
    public static int[] getTimes(int numCustomers, int[] arr, int[] direction) {
        int[] res = new int[arr.length];
        int t = arr[0], pre = 1; // t: current time, pre: previous is in/out
        List<Queue<Integer>> qs = new ArrayList<>();
        qs.add(new LinkedList<Integer>());
        qs.add(new LinkedList<Integer>());
        for (int i = 0; i < direction.length; i++) {
            qs.get(direction[i]).offer(i);
        }
        while (!qs.get(0).isEmpty() || !qs.get(1).isEmpty()) {

            if (qs.get(0).isEmpty()) {
                t = Math.max(t, arr[qs.get(1).peek()]);
                pre = 1;
            } else if (qs.get(1).isEmpty()) {
                t = Math.max(t, arr[qs.get(0).peek()]);
                pre = 0;
            } else if (arr[qs.get(0).peek()] > t && arr[qs.get(1).peek()] > t) {
                t = Math.min(arr[qs.get(0).peek()],arr[qs.get(1).peek()]);
                pre = 1;
            }

            if (qs.get(pre).isEmpty() || arr[qs.get(pre).peek()] > t) {
                pre = (pre + 1) % 2;
            }
            res[qs.get(pre).poll()] = t++;

        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 5};
        int[] dir = {0, 1, 1, 0};
        System.out.println(Arrays.toString(getTimes(4, arr, dir)));
    }

}
