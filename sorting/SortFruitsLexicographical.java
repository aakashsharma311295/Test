package sorting;

import java.util.Arrays;

public class SortFruitsLexicographical {

    public static void main(String[] args) {
        String[] fruits = {"kiwi","apple","papaya","mango"};
//        String[] fruits = {"2","100","1","10"};

        for (int i=0;i<fruits.length-1;i++){
            int minIndex = i;

            for (int j=i+1;j<fruits.length;j++){
                if (fruits[j].compareTo(fruits[minIndex]) < 0){
                    minIndex = j;
                }
            }

            String temp = fruits[i];
            fruits[i] = fruits[minIndex];
            fruits[minIndex] = temp;
        }

        System.out.println(Arrays.toString(fruits));
    }
}
