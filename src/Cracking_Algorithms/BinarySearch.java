package Cracking_Algorithms;

public class BinarySearch {

	public static boolean binary_search(int[] arr, int value){
		int first = 0;
		int last = arr.length - 1;
		int mid_array = 0;
		boolean result = false;
	
		while(first<=last){
			mid_array = (first + last)/2;
			if(arr[mid_array] == value){
				result = true;
				return result;
			} else {
				if(value<arr[mid_array]){
					last = mid_array - 1;
				} else{
					first = mid_array + 1;
				}
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,6,10,14};
		int value = 10;
				
		System.out.println(binary_search(arr, value));

	}

}
