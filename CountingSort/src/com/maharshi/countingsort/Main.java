package com.maharshi.countingsort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[] {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray, 1, 10);

        for (int num : intArray)
            System.out.println(num);

    }

    public static void countingSort(int[] input, int min, int max) {
        int[] countArray = new int[max - min + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }

}
