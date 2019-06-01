package com.practice.cyclic.sort;

import java.util.LinkedList;
import java.util.List;

public class FindAllMissingNumbersFrom1toN {

    public static List<Integer> findMissingNumbers(int[] arr){

        int i=0;
        List<Integer> missingNumber = new LinkedList<>();

        while (i<arr.length){
            if(arr[i]-1 != i && arr[arr[i]-1] != arr[i]) {
                swap(arr, arr[i]-1, i);
                continue;
            }

            i++;
        }

        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1)
                missingNumber.add(i+1);
        }

        return missingNumber;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
}
