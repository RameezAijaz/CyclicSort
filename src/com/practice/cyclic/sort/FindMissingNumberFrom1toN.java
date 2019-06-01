package com.practice.cyclic.sort;

public class FindMissingNumberFrom1toN {

    public static int findMissing(int[] arr){
        int i=0, j=0;

        while(i<arr.length){
            if(arr[i]<arr.length && arr[i] != i){
                swap(arr, i, arr[i]);
            }
            else {
                i++;
            }

        }

        for(j=0; j<=arr.length; j++){
            if(j==arr.length || arr[j] != j)
                break;

        }
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
