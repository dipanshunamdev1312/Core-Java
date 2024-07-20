package com.leet_code_problems;

import java.util.Arrays;

public class Two_Sum {

	public static int[] twoSum(int[] arr, int target) {

		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == target) {
					int[] a = { i, j };
					return a;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 4, 8 };
		int target = 7;

		int[] twoSum = twoSum(arr, target);

		System.out.println(Arrays.toString(twoSum));
	}

}
