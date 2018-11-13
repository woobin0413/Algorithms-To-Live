package Cracking_Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

//http://www.techiedelight.com/check-subarray-with-0-sum-exists-not/
//Input { 3,4,-7,3,1,3,1,-4,-2,-2};
//Ouput Subarray with 0 sum exists
//ex: {3,4,-7}

public class Check_subarray_sum_zero {

	public static void calculateSum(int[] arr) {
		HashSet<String> set = new HashSet<>();
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			sum+= arr[i];
			for (int j = i+1; j < arr.length; j++) {
				for (int j2 = j; j2 < arr.length; j2++) {
					if(arr[i]+arr[j]+arr[j2] == 0) {
						System.out.println(arr[i]+","+arr[j]+","+arr[j2]);
					}
				}
			}	
		}
	}
	

	public static void main(String[] args) throws IOException {
	
		int[] arr = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		calculateSum(arr);

	}

}