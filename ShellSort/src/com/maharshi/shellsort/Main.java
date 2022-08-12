package com.maharshi.shellsort;

public class Main {

	public static void main(String[] args) {

		int[] intArray = new int[] { 20, 35, -15, 7, 55, 1, -22 };

		for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
			
			for (int i = gap; i < intArray.length; i++) {
				
				int temp = intArray[i];
				
				int j = i;
				while (j >= gap && intArray[j - gap] > temp) {
					intArray[j] = intArray[j - gap];
					j -= gap;
				}
				intArray[j] = temp;
			}
		}

		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
