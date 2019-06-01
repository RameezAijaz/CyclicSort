package com.practice.cyclic.sort;

import java.util.LinkedList;
import java.util.List;

public class FindAllDuplicatesFrom1toN {
    public static List<Integer> find(int[] arr){

        int i=0;
        List<Integer> duplicates = new LinkedList<>();

        while (i<arr.length){
            if(arr[i] != i+1 && arr[i] != arr[arr[i]-1]){
                swap(arr, arr[i]-1, i);
            }
            else {
                i++;
            }
        }

        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1)
                duplicates.add(arr[i]);
        }
        return duplicates;
    }

    private static void swap(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }
}
