package com.maharshi.sortingArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[] {20, 35, -15, 7, 55, 1, -22};

//        Arrays.sort(intArray);
        Arrays.parallelSort(intArray);
        for (int num : intArray)
            System.out.println(num);

    }
}