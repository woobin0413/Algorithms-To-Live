package Cracking_Algorithms;

import java.sql.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

//https://www.techiedelight.com/find-sub-array-with-0-sum/
//Input { 4,2,-3,-1,0,4};
//Ouput Subarray with 0 sum exists
//ex: {-3,-1,0,4}, {0}
//APPROACH 2: Multimap to print all subarrays
public class SubArrays_with_zero {

	public static<K,V> void insert(Map<K,List<V>> hashMap, K key, V value){
		if(!hashMap.containsKey(key)){
			hashMap.put(key, new ArrayList<>());
		}
		hashMap.get(key).add(value);
	}
	public static void calculation(int[] arr){
		 Map<Integer, List<Integer>> hashMap = new HashMap<>(); 
		 insert(hashMap, 0, -1);
		 int sum = 0;
		 for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if (hashMap.containsKey(sum)) {
				List<Integer> list = hashMap.get(sum);
				for (Integer integer : list) {
					System.out.println("subarray : " + (integer + 1) + "... " + i );
				}
			}
			insert(hashMap, sum, i);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Map m1 = new HashMap(); 
	
		int[] arr = { 3,4,-7,3,1,3,1,-4,-2,-2};
		
		calculation(arr);

	}
}