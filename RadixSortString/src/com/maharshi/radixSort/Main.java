package com.maharshi.radixSort;

public class Main {
    public static void main(String[] args) {
        String[] radixArray = new String[]{"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};


        System.out.println("=====Before sorting=====");
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }

        radixSort(radixArray, 26, 5);

        System.out.println("=====After sorting=====");
        for (int i = 0; i < radixArray.length; i++) {
            System.out.println(radixArray[i]);
        }
    }

    public static void radixSort(String[] input, int radix, int width) {
        for (int i = width - 1; i >= 0; i--) {
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];

        for (String value : input) {
            countArray[getIndex(position, value)]++;
        }
        /** Adjust the count array */
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }

        String[] temp = new String[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getIndex(position, input[tempIndex])]] = input[tempIndex];
        }

        System.arraycopy(temp, 0, input, 0, numItems);

    }

    public static int getIndex(int position, String value) {
        return value.charAt(position) - 'a';
    }

}