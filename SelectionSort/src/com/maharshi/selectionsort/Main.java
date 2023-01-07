package com.maharshi.selectionsort;

public class Main {

	public static void main(String[] args) {

		int[] intArray = new int[] { 20, 35, -15, 7, 55, 1, -22 };

		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[largest] < intArray[i])
					largest = i;
			}
			swap(intArray, largest, lastUnsortedIndex);
		}

		for (int j : intArray) {
			System.out.println(j);
		}

	}

	private static void swap(int[] array, int i, int j) {

		if (i == j)
			return;

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
