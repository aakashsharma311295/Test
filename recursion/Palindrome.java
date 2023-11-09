package recursion;

public class Palindrome {

    static boolean isPalindrone(String s, int left, int right){

        if (left>= right) return true;

        if (s.charAt(left) == s.charAt(right)) {
            return isPalindrone(s, left+1, right-1);
        }else {
            return false;
        }

    }

    static int reverseNumber(int n, int temp){
        if (n==0) return temp;
        temp = temp*10 + n%10;
        return reverseNumber(n/10, temp);
    }

    public static void main(String[] args) {
        String s = "levels";
        System.out.println(isPalindrone(s, 0, s.length()-1));

        int n = 12231; // 122
        System.out.println(reverseNumber(n, 0));
    }
}
