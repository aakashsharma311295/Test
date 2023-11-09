package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    static List<String> subsequence(String s, int index){

        if (index == s.length()){
            List<String> list = new ArrayList<>();
            list.add("");
            return list;
        }

        List<String> ans = subsequence(s, index+1);
        List<String> finalAns = new ArrayList<>();
        finalAns.addAll(ans);
        for (String str :ans){
            finalAns.add(s.charAt(index)+str);
        }
        return finalAns;
    }

    static void approach2(String s, int index, String temp){

        if (index == s.length()){
            System.out.println(temp);
            return;
        }

        approach2(s, index+1, temp);
        approach2(s, index+1, temp+s.charAt(index));
    }


    public static void main(String[] args) {
        String s = "abc";
        System.out.println(subsequence(s, 0));
        approach2(s, 0, "");
    }
}
