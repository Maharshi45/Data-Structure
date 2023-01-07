package com.maharshi.bubblesort;

public class Main {

	public static void main(String[] args) {

		int[] intArray = new int[] { 20, 35, -15, 7, 55, 1, -22 };

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = 0; j < intArray.length - i - 1; j++) {
				if (intArray[j] > intArray[j + 1]) {
					swap(intArray, j, j + 1);
				}
			}
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
