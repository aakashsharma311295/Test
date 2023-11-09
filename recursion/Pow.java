package recursion;

public class Pow {

    static int pow(int p, int q){

        if (q == 0) return 1;
        return pow(p, q-1)*p;
    }

    static int pow2(int p, int q){
        if (q==0) return 1;
        int smallAns = pow(p, q/2);
        if (q%2==0){
            return smallAns*smallAns;
        }else {
            return smallAns*smallAns*p;
        }
    }

    public static void main(String[] args) {
        int p = 2;
        int q = 9;
        System.out.println(pow(p,q));
        System.out.println(pow2(p,q));
    }
}
