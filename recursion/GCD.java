package recursion;

public class GCD {

    static int approach1(int x, int y){
        int smallest;
        if (x>y){
            smallest = y;
        }else {
            smallest = x;
        }
        while (smallest>0){
            if(x%smallest == 0 && y%smallest==0){
                return smallest;
            }
            smallest--;
        }

        return -1;

    }

    static int approach2(int x, int y){
        int divisor = x;
        int dividend = y;
//        if (x>y){
//            divisor = y;
//            dividend = x;
//        }else {
//            divisor = x;
//            dividend = y;
//        }

        while (dividend%divisor!=0){
            int reminder = dividend%divisor;
            dividend = divisor;
            divisor = reminder;

        }

        return divisor;
    }

    static int euclidApproach(int x, int y){
        if (y ==0){
            return x;
        }

        return euclidApproach(y, x%y);
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 16;
        System.out.println(approach1(x,y));
        System.out.println(approach2(x,y));
        System.out.println(euclidApproach(x,y));
    }
}
