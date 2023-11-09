package recursion;

public class RemoveOccurences {

    static String remove(String s, int index){
        if (index == s.length()) return "";

        String ans = remove(s, index+1);
        if (s.charAt(index) != 'a'){
            return s.charAt(index) + ans;
        }
        return ans;
    }


    static String remove2(String s){
        if (s.length() == 0) return "";

        String ans = remove2(s.substring(1));
        if (s.charAt(0) != 'a'){
            return s.charAt(0) + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "abcdaa";
        System.out.println(remove(s, 0));
        System.out.println(remove2(s));

    }
}
