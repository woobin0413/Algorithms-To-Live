package Cracking_Algorithms;

import java.sql.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.techiedelight.com/find-sub-array-with-0-sum/
//Input { 4,2,-3,-1,0,4};
//Ouput Subarray with 0 sum exists
//ex: {-3,-1,0,4}, {0}
//APPROACH 1: Naive Solution
public class CopyOfSubArrays_with_zero2 {

	public static void calculation(int[] arr) {
		
		int term = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum == 0){
					System.out.println(i + ", " + j);
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		Map m1 = new HashMap(); 
	
		int[] arr = { 4,2,-3,-1,0,4,5,3,-8};
		
		calculation(arr);

	}
}