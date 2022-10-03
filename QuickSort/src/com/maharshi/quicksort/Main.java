package com.maharshi.quicksort;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[] {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int n : intArray) {
            System.out.println(n);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2)
            return;

        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is going to use the first element as pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }

}
