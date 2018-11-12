package Cracking_Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/x-total-shapes/0
//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
//https://ide.geeksforgeeks.org/G9D5tY
public class X_Total_Shapes
 {
	
	public static void checkVisted(int vert, int horizon, int i, int j, char[][] arr,boolean[][] visited) {
		if(arr[i][j] == 'X' && (!visited[i][j])) {
			visited[i][j] = true;
			if(i+1<vert) {
				checkVisted(vert, horizon, i+1, j, arr, visited);
			}
			if(i-1>=0){
				checkVisted(vert, horizon, i-1, j, arr, visited);
			}
			if(j+1<horizon){
				checkVisted(vert, horizon, i, j+1, arr, visited);
			}
			if(j-1>=0){
				checkVisted(vert, horizon, i, j-1, arr, visited);
			}
		}
	}
	
	public static int calculateVisit(int vert, int horizon, char[][]arr){
		int numVisit = 0;
		boolean[][] visited = new boolean[vert][horizon];
		
		for (int i = 0; i < vert; i++) {
			for (int j = 0; j < horizon; j++) {
				if(arr[i][j] == 'X') {
					if(visited[i][j]) continue;
					else {
						checkVisted(vert, horizon, i, j, arr, visited);
						numVisit++;
					}
					
					
				}
			}
		}
		return numVisit;
	}
	
	  public static void main (String[] args) throws IOException {
		  //bufferedReader using as scanner
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Type the number of arrays : ");
		  int arrayNum = Integer.parseInt(br.readLine());
		  
		  for (int i = 0; i < arrayNum; i++) {
			System.out.print("vertical matrix : ");
			int vert = Integer.parseInt(br.readLine());
			System.out.print("horizontal matrix : ");
			int horizon = Integer.parseInt(br.readLine());
			
			char[][] arr = new char [vert][horizon];
			
			for (int j = 0; j < vert; j++) {
				System.out.print("X shapes : ");
				char [] eachArr = br.readLine().toCharArray();
				for (int k = 0; k < horizon; k++) {
					arr[j][k] = eachArr[k];
				}
			}
			int res=calculateVisit(vert, horizon, arr);
            System.out.println(res);
		}
		
	  }
	  
 }
