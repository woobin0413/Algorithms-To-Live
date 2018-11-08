package Cracking_Algorithms;
//https://www.geeksforgeeks.org/counting-inversions

import java.util.ArrayList;

public class CountInversions {

	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	static int getInvCount(int n) {
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if(list.get(i)>list.get(j)) {
					count++;
				}
			}
		}
	return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list.add(6);
		list.add(3);
		list.add(13);
		list.add(2);
		list.add(11);
		list.add(1);
		
		System.out.println("number of inversion count is : "  + getInvCount(list.size()));
	
		
	}

}

