package com.practice.cyclic.sort;

public class SortInPlaceForNumFrom1ToN {

    public static void sort(int[] arr){

        for(int i=0; i<arr.length; i++){
            while(arr[i] != i+1){
                int num = arr[i];
                arr[i] = arr[num-1];
                arr[num-1] = num;
            }
        }

    }
}
