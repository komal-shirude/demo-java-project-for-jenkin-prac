package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import java.util.*;

public class DuplicateFinder {

    public static Set<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }

            System.out.println("duplicates Data member : " + duplicates);
            System.out.println("seen Data member : " + seen);
        }

        return duplicates;
    }

    public static void main(String[] args) {
        int[] data = {1, 4, 6, 2, 4, 6, 6};
        System.out.println("Final Output: " + findDuplicates(data));
    }
}
