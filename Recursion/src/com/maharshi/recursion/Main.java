package com.maharshi.recursion;

public class Main {

	public static void main(String[] args) {

		System.out.println(factorial(4));

	}

	private static long factorial(long num) {
		if (num == 0)
			return 1;
		return num * factorial(num - 1);
	}

}
