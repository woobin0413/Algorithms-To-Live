package Cracking_Algorithms;
import java.sql.Array;
//cntl + shift + f for reindent
import java.util.Arrays;

public class Array_and_string {

	// check boolean array if str has a unique
	// char stored in boolean type array

	public static boolean isUniqueChars(String str) {
		if (str.length() > 256) {
			return false;
		} else {
			boolean[] char_set = new boolean[256];
			for (int i = 0; i < str.length(); i++) {
				int value = str.charAt(i);
				if (char_set[value]) {
					return false;
				}
				char_set[value] = true;
			}
		}
		return true;
	}

	// O(n^2) = time complexity, O(1) space complexity
	public static boolean isUniqueChars_bit_vector(String str) {
		if (str.length() > 26) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			// using charAt(i) - 'a';
			// 'c' - 'a' = 2
			// 'l' - 'a' = 11
			// str = 'cat'
			int value = str.charAt(i) - 'a';
			if ((checker & (1 << value)) > 0) {
				return false;
			}
			checker |= (1 << value);
		}
		return true;
	}

	// p222
	public static String sort(String str) {

		char[] content = str.toCharArray();
		// c d == dc
		// 문자열을 정렬해서 저장한다.
		Arrays.sort(content);
		return new String(content);
	}

	public static boolean permutation(String str1, String str2) {
		// String s1 = str1.replaceAll("\\s+","");
		// String s2 = str2.replaceAll("\\s+","");;
		//
		// if(s1.length() != s2.length()){
		// return false;
		// }
		//
		// return sort(s1).equals(sort(s2));

		// method 2
		if (str1.length() != str2.length()) {
			return false;
		} else {
			// ASCII max = 256
			int[] letters = new int[256];
			char[] s_array = str1.toCharArray();
			for (char c : s_array) {
				letters[c]++;
				System.out.println(letters[c]);
			}
			for (int i = 0; i < str2.length(); i++) {
				// decimal value
				// int x = str.charAt(i) c => 99
				// char x = str.charAt(i) c => c
				int c = str2.charAt(i);
				if (--letters[c] < 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void replaceSpace(char[] str) {

		String new_str = "";
		for (char c : str) {

			if (c == ' ') {

				new_str += "%20";
			} else {
				new_str += c;
			}

		}
		System.out.println(new_str);
	}
	//time complexity => O(p+k^2)
	public static String redundantStr(String str){
		int count = 1;
//		String new_str = Character.toString(str.charAt(0));
		char last = str.charAt(0);
		String new_str = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == last) {
				count++;
			} else {
				new_str += last + "" + count;
				last = str.charAt(i);
				count = 1;
			}
		}
		return new_str + last + count;
		
	}
	
	public static boolean isRotation(String s1, String s2){
//		String new_s1 = s1.replaceAll("\\s+","");
//		String new_s2 = s2.replaceAll("\\s+","");
//		char[] content = new_s1.toCharArray();
//		char[] content2 = new_s2.toCharArray();
//		Arrays.sort(content);
//		Arrays.sort(content2);
//		
//		return (Arrays.equals(content, content2));
		
//		book solution -->
		int len = s1.length();
		boolean result = false;
		if(len == s2.length() && len > 0){
			String s1s1 = s1 + s1;
			isRotation(s1s1, s2);
			result = true;
			
		}	return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(isUniqueChars("jowbs"));

		// System.out.println(permutation("dcbba","cbbad"));
		// System.out.println('\0');
//		String str = "hello my name is Ben";
//		char[] ch_str = str.toCharArray();

//		replaceSpace(ch_str);
//		System.out.println(redundantStr("abbcddfff"));
		System.out.println(isRotation("waterbottle", "erbottlewat"));
		
	}
}
