package com.practice.cyclic.sort;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*
        We are given an array containing ‘n’ objects. Each object, when created, was assigned a unique number from 1 to ‘n’ based on their creation sequence. This means that the object with sequence number ‘3’ was created just before the object with sequence number ‘4’.

        Write a function to sort the objects in-place on their creation sequence number in O(n) and without any extra space. For simplicity, let’s assume we are passed an integer array containing only the sequence numbers, though each number is actually an object.

        Example 1:

        Input: [3, 1, 5, 4, 2]
        Output: [1, 2, 3, 4, 5]
        Input: [3, 1, 5, 4, 2]
        Output: [1, 2, 3, 4, 5]*/


        int[] seq = new int[]{3,1,5,4,2};

        System.out.println("SORT "+Arrays.toString(seq));
        SortInPlaceForNumFrom1ToN.sort(seq);
        System.out.println(Arrays.toString(seq));


       /* We are given an array containing ‘n’ distinct numbers taken from the range 0 to ‘n’. Since the array has only ‘n’ numbers out of the total ‘n+1’ numbers, find the missing number.

         Example 1:

        Input: [4, 0, 3, 1]
        Output: 2
        Input: [4, 0, 3, 1]
        Output: 2*/

       int[] arr = new int[]{4,0,3,1};
       int missingNumber =FindMissingNumberFrom1toN.findMissing(arr);

        System.out.println("MISSING NUMBER IN "+Arrays.toString(arr));
        System.out.println(missingNumber);


       /* We are given an unsorted array containing numbers taken from the range 1 to ‘n’. The array can have duplicates, which means some numbers will be missing. Find all those missing numbers.

        Example 1:

        Input: [2, 3, 1, 8, 2, 3, 5, 1]
        Output: 4, 6, 7
        Input: [2, 3, 1, 8, 2, 3, 5, 1]
        Output: 4, 6, 7 */

        arr = new int[]{2, 3, 1, 8, 2, 3, 5, 1};

        List<Integer> missingNumberList = FindAllMissingNumbersFrom1toN.findMissingNumbers(arr);

        System.out.println("FIND ALL MISSING NUMBERS IN "+Arrays.toString(arr));
        System.out.println(missingNumberList);

/*
        We are given an unsorted array containing ‘n+1’ numbers taken from the range 1 to ‘n’. The array has only one duplicate but it can be repeated multiple times. Find that duplicate number without using any extra space. You are, however, allowed to modify the input array though.

        Example 1:

        Input: [1, 4, 4, 3, 2]
        Output: 4
        Input: [1, 4, 4, 3, 2]
        Output: 4

        */

        arr = new int[]{1, 4, 4, 3, 2};
        System.out.println("FIND A DUPLICATE NUMBER IN "+Arrays.toString(arr));
        int duplicateNumber = FindDuplicateNumberFrom1toN.find(arr);
        System.out.println(duplicateNumber);

/*
        Similar Problems
        Problem 1: Can we solve the above problem in O(1)O(1) space and without modifying the input array?
        */

        arr = new int[]{1, 4, 4, 3, 2};
        duplicateNumber = FindDuplicateNumberFrom1toNWithoutModifying.find(arr);
        System.out.println("FIND A DUPLICATE NUMBER IN "+Arrays.toString(arr) + " WITHOUT MODIFYING IT");
        System.out.println(duplicateNumber);


      /*  We are given an unsorted array containing ‘n’ numbers taken from the range 1 to ‘n’. The array has some duplicates, find all the duplicate numbers without using any extra space.

        Example 1:

        Input: [3, 4, 4, 5, 5]
        Output: [4, 5]
        */

      arr = new int[]{3,4,4,5,5};

      System.out.println("FIND ALL DUPLICATES NUMBER IN "+Arrays.toString(arr));
      List<Integer> allDuplicates = FindAllDuplicatesFrom1toN.find(arr);
      System.out.println(allDuplicates);


    }
}
