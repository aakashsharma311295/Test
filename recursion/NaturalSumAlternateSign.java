package recursion;

public class NaturalSumAlternateSign {

    static int sum(int n){
        if (n == 1) return 1;
        return sum(n-1)+n;

    }

    static int alternateSignSum(int n){

        if (n ==1) return 1;

        int sum = alternateSignSum(n-1);
        if (n%2 ==0){
            return sum-n;
        }else {
            return sum+n;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
        System.out.println(alternateSignSum(n));
    }
}
