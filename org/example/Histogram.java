package org.example;

import java.util.Arrays;
import java.util.Stack;

public class Histogram {

    static int[] nextSmallerElement(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        ans[arr.length-1] = -1;
        stack.push(arr.length-1);
        stack.push(arr.length-1);
        for (int i = arr.length-2;i>=0;i--){
            while (!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    static int[] previousSmaller(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        ans[0] = -1;
        stack.push(0);
        for (int i=1;i<arr.length;i++){
            while (!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if (stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        int[] nextSmaller = nextSmallerElement(arr);
        int[] previousSmaller = previousSmaller(arr);
        int max = 0;
        for (int i=0;i<arr.length ;i++){
            int nextSmallerIndex = nextSmaller[i] == -1 ? arr.length : nextSmaller[i];
            int prevSmallerInex = previousSmaller[i] == -1 ? 0 : previousSmaller[i]+1;

            max = Math.max(max, arr[i]*(nextSmallerIndex-prevSmallerInex));
        }

        System.out.println(max);
    }
}
