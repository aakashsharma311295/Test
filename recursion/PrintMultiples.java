package recursion;

public class PrintMultiples {

    static void print(int num, int k){
        if (k == 0) return;

        print(num, k-1);

        System.out.println(num*k);
    }

    public static void main(String[] args) {
        int num = 12;
        int k = 5;
        print(num, k);
    }
}
