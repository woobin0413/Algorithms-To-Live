package Cracking_Algorithms;

import java.util.ArrayList;

//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
//https://blog.naver.com/metalingus58/221378577523
public class Breadth_First_Search {

	static int n,m;
	static int[] visit;
	static ArrayList<Integer>[] con;
	
	public static void main(String[] args) throws Exception{
		for (int i = 0; i < con.length-1; i++) {
			con[i] = new ArrayList<>();
		}
		con[1].add(2);
		con[1].add(3);
		con[1].add(7);
		con[2].add(4);
		con[3].add(5);
		con[3].add(6);
	
	}

}

