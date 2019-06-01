package com.practice.cyclic.sort;

public class FindDuplicateNumberFrom1toN {

    public static int find(int[] arr){

        int i=0;

        while(i<arr.length){


            if(arr[i] != i+1 && arr[arr[i]-1] != arr[i]){
                swap(arr, arr[i]-1, i);
            }
            else if(arr[i] != i+1){
                return arr[i];
            }
            else {
                i++;
            }


        }
        return -1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
