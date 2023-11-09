package org.example;

import java.util.HashMap;
import java.util.Map;

public class Test2{

    static boolean checkAnagrams(String s1 , String s2){
        if(s1.length() != s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i), 1);
            }else{
                map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
            }
        }
        for(int i=0;i<s2.length();i++){
            if(!map.containsKey(s2.charAt(i))) return  false;
        }

        return true;
    }
//    i/ps:	1<steps<10000
//    currentPosition = ['N', 'E', 'W', 'S']
//    moveDirection = ['A', 'C']		Anticlockwise / clockwise
/*    public char findDirection(char currPos, int steps, char moveDir) {
        char currPosition  = currPos;
        int rem = 0;
        char[] positions = {'N', 'E', 'S', 'W'};
        for(int i=0;i<steps;i++){
            rem = steps%4;
        }

    }*/
    public static void main(String[] args) {
        String s1 = "state";
        String s2 = "tastes";
        System.out.println(checkAnagrams(s1, s2));

    }
}
