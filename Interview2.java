public class Interview2 {



    static void isSorted(int[] arr){
        if (arr.length == 1) {
            System.out.println("sorted");
            return;
        }

        boolean flag = false;
        boolean lastOrder = true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]>arr[i-1]){
//                flag = true;
//                System.out.println("not sorted");
//                break;
                if (!lastOrder){
                    System.out.println("not sorted");
                    break;
                }
                lastOrder = true;
            }else if (arr[i]<arr[i-1]){
                if (lastOrder){
                    System.out.println("not sorted");
                    break;
                }
                lastOrder = false;
            }
        }

        if (lastOrder){
            System.out.println("Ascending sorted");
        }else {
            System.out.println("Descending order");
        }
    }


    public static void main(String[] args) {
//        CustomList<Integer> customList = new CustomList<>()
            //1 2  4 3 5    5 4 3 2 1
        int[] arr = {1,2,3,4,5};
        isSorted(arr);
    }


}
