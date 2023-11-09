package recursion;

public class ReverseString {

    static String reverse(String s, int index){
        if (index == s.length()) return "";

        String ans = reverse(s, index+1);
        return ans + s.charAt(index);
    }

    static String reverse2(String s){
        if (s.length() ==0) return "";

        String ans = reverse2(s.substring(1));
        return ans + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(reverse(s, 0));
        System.out.println(reverse2(s));
    }
}
