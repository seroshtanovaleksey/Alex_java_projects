package Tic.TicTac;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[] {38,27,43,3,9,82,10})));
    }

    public static int[] bubbleSort(int[] arr){
       for (int i = arr.length-1;i>0;i--){
           for (int j=0;j<i;j++){
               if (arr[j]>arr[j+1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;

               }
           }
       }
       return arr;
    }

}
