package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        HashSet<Integer> table = new HashSet<>();
//        Scanner sc = new Scanner(System.in).
        int max = 0;
        for (int i=0;i<nums.length;i++){
            if (table.contains(nums[i])){
                table.remove(nums[i]);
            }else {
                table.add(nums[i]);
                max = Math.max(max, table.size());
            }
        }

        System.out.println(max);
        System.out.println(2>3);
    }
    }

