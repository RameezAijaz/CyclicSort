package com.practice.cyclic.sort;

public class FindDuplicateNumberFrom1toNWithoutModifying {

    public static int find(int [] arr){

        int slow =0;
        int fast =0;

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while (slow != fast);

        int current = arr[slow];
        int length = 0;

       do{
           current = arr[current];
           length++;
       }while (arr[slow] != current);


       return findStartOfCycle(arr, length);
    }

    private static int findStartOfCycle(int[] arr, int length) {

        int pointer1=0, pointer2=0;

        while (length>0){
            pointer1 = arr[pointer1];
            length--;
        }

        while (arr[pointer2] != arr[pointer1]){
            pointer1 = arr[pointer1];
            pointer2 = arr[pointer2];
        }

        return arr[pointer2];
    }
}
