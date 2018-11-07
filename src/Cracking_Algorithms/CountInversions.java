package Cracking_Algorithms;

public class CountInversions {

	static int arr[] = new int[] { 1, 20, 6, 4, 5 }; 
	
	static int getInvCount(int n) {
		int count = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i + 1; j < n; j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
	return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Number of inversions are "
                  + getInvCount(arr.length)); 
	}

}
