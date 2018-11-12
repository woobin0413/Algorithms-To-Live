package Cracking_Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

//http://www.techiedelight.com/find-pair-with-given-sum-array/
//Input { 8, 7, 2, 5, 3, 1 };
//ouput {8,2}.{7,3}

public class Pair_With_Given_Sum {
	public static void calculateSum(int[] arr, int sum) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if ((arr[i] + arr[j]) == sum) {
					System.out.println(arr[i] + ", " + arr[j]);
				}

			}
		}

	}

	public static void main(String[] args) throws IOException {
		// bufferedReader using as scanner
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		calculateSum(arr, sum);

	}
}