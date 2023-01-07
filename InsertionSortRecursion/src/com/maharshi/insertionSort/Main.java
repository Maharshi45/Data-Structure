package com.maharshi.insertionSort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        insertionSort(intArray, intArray.length);
        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void insertionSort(int[] input, int numItems) {
        if (numItems < 2)
            return;
        insertionSort(input, numItems - 1);
        int temp = input[numItems - 1];
        int i = numItems - 1;

        while (i > 0 && temp < input[i - 1]) {
            input[i] = input[i - 1];
            i--;
        }
        input[i] = temp;
    }

}
