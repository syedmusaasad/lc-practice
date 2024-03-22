package com.lc.practice.questionbank;

/*
https://www.geeksforgeeks.org/binary-search/
You are given a sorted array of integer and a number to find

Return a boolean true if number is found in array
Return a boolean false if number is not found in array

Example 1
Input: nums = [1,2,3,4,5] 3
Output: true
Explanation: 3 is in position 2 of the array

Example 2
Input: nums = [1,2,3,4,5] 6
Output: false
Explanation: 6 is not in the input array
 */
public class FindInSortedArray {
    static boolean suboptimalSolution(int[] input, int find) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == find) {
                return true;
            }
        }
        return false;
    }

    static boolean optimalSolution(int[] input, int find) {
        int start = 0;
        int end = input.length - 1;
        return search(input, start, end, find);
    }

    static boolean search(int[] input, int start, int end, int find) {
        if (start > end) {
            return false;
        }
        int mean = (start + end) / 2;
        if (input[mean] == find) {
            return true;
        } else if (input[mean] > find) {
            return search(input, start, mean - 1, find);
        } else {
            return search(input, mean + 1, end, find);
        }
    }
}
