package com.Dsa.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] input = { 2, 7, 11, 15 };

		System.out.println(Arrays.toString(twoSum(input, 9)));
	}

	public static int[] twoSum(int[] arr, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int remainder = target - arr[i];

			if (map.containsKey(remainder)) {
				return new int[] { map.get(remainder), i };
			}

			map.put(arr[i], i);
		}

		return new int[0];
	}

}
