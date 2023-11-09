package recursion;

public class DigitsSum {

    static int sumDigits(int n){
        if (n==0) return 0;


        return sumDigits(n/10) + n%10;
    }

    static int countDigits(int n){
        if (n>=0&& n<=9) return 1;

        return countDigits(n/10) + 1;
    }

    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumDigits(n));
        System.out.println(countDigits(n));
    }
}
