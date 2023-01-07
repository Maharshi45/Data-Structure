package com.maharshi.insertionsort;

public class Main {

	public static void main(String[] args) {

		int[] intArray = new int[] { 20, 35, -15, 7, 55, 1, -22 };

		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

			int temp = intArray[firstUnsortedIndex];
			int i = firstUnsortedIndex;

			while (i > 0 && temp < intArray[i - 1]) {
				intArray[i] = intArray[i - 1];
				i--;
			}

			intArray[i] = temp;
		}
		for (int j : intArray) {
			System.out.println(j);
		}
	}

}
