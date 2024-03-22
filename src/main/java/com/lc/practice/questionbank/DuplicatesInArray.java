package com.lc.practice.questionbank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
You are given a 1d array

Find all duplicates in an array.
Order of the output does not matter.
Duplicates in the output are not allowed.

Example 1
Input: nums = [1,2,3,4,5,7,8,9,5]
Output: [5]
Explanation: 5 is at position 4 and 8

Example 2
Input: nums = [1,1,1,1,2,9,2]
Output: [1,2]
Explanation: 1 is at position 0, 1, 2, and 3, 2 is at position 4 and 6
 */
public class DuplicatesInArray {
    static Set<Integer> suboptimalSolution(int[] input) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j]) {
                    set.add(input[i]);
                }
            }
        }
        return set;
    }

    static Set<Integer> optimalSolution(int[] input) {
        Set<Integer> map = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < input.length; i++) {
            if (map.contains(input[i])) {
                set.add(input[i]);
            }
            map.add(input[i]);
        }
        return set;
    }
}
