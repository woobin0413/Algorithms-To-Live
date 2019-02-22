package Cracking_Algorithms;

import java.util.Enumeration;
import java.util.Set;
import java.util.Hashtable;


public class HashTable_simulator {
	private static int hashSize = 20;
	static Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
	static Hashtable<Integer, Integer> temp_hash = new Hashtable<Integer, Integer>();
	
	public static void hashingTech(Set<Integer> keys){
			keys = h.keySet();
			for (Integer key : keys) {
				int index = key%hashSize;
				if(temp_hash.containsKey(index)){
					++index;
				}
				temp_hash.put(index, key);
				
			}
			
	}
	

	public static boolean hashingInsert(int key, int value){
		Set<Integer> keys = temp_hash.keySet();
		int new_index = key%hashSize;
		boolean result = false;
		
		if(!temp_hash.containsKey(new_index)){
			temp_hash.put(new_index, key);
			System.out.println(temp_hash);
			return true;
		} else {
			++new_index;
			for (int i=0; i<temp_hash.size()-1;i++) {
				if(temp_hash.containsKey(new_index)){
					++new_index;
				} else {
					temp_hash.put(new_index, key);
					System.out.println(temp_hash);
					return true;
				}
			}
		}  
		return false;			
	}
	
	
	public static boolean hashingSearch(int key){
		boolean result = false;
		result = temp_hash.containsValue(key);
		return result;
	}
	
	public static boolean hashingDelete(int key){
		int new_index = key%hashSize;
		boolean result = false;
	
		if(temp_hash.contains(key)) {
			temp_hash.remove(new_index);
			result = true;	
		} 
		
		else {
			result = false;
		}	
		
		return result;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		h.put(1, 20);
		h.put(2, 70);
		h.put(42,80);
		h.put(4, 25);
		h.put(12,44);
		h.put(14,32);
		h.put(17,11);
		h.put(13,78);
		h.put(37,98);
		hashingTech(h.keySet());	
		//System.out.println(hashingSearch(15));
		
		
//		System.out.println(hashingInsert(57,45));
		System.out.println(hashingDelete(14));
		
	}

}
