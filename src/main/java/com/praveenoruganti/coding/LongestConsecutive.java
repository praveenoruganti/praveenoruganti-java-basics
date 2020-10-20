package com.praveenoruganti.coding;

import java.util.Arrays;

public class LongestConsecutive {

	public static void main(String[] args) {

		int[] arr = { 100, 4, 200, 1, 3, 2 };

		int r = LongestConsecutiveElement(arr);

		System.out.println(r);

	}

	public static int LongestConsecutiveElement(int[] arr)

	{

		// sort the array first

		Arrays.sort(arr);

		// Declare two variable to store the result

		int result = 0, count = 1;

		// Take a for loop to iterate the given array

		for (int i = 0; i < arr.length - 1; i++)

		{

			// If next element is one greater than the current element

			// or current element and next element is equal if we substract 1 from the next
			// element

			// we are checking for the next element each time so, array length will be
			// length-1

			if (arr[i] == arr[i + 1] - 1)

				count++;

			else

				count = 1;

			// update the max count

			result = Math.max(result, count);

		}

		return result;

	}

}
