package Cracking_Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

//https://practice.geeksforgeeks.org/problems/x-total-shapes/0
//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
//https://ide.geeksforgeeks.org/G9D5tY
public class X_Total_Shapes
 {
     
	  public static void main (String[] args) throws IOException {
		  //bufferedReader using as scanner
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("Type the number of arrays : ");
		  int arrayNum = Integer.parseInt(br.readLine());
		  
		  for (int i = 0; i < arrayNum; i++) {
			System.out.print("/n"+"vertical matrix : ");
			int vert = Integer.parseInt(br.readLine());
			System.out.print("/n"+"horizontal matrix : ");
			int horizon = Integer.parseInt(br.readLine());
			
			char[][] arr = new char [vert][horizon];
			
			for (int j = 0; j < vert; j++) {
				System.out.print("/n"+"X shapes : ");
				char [] eachArr = br.readLine().toCharArray();
				for (int k = 0; k < horizon; k++) {
					arr[j][k] = eachArr[k];
					
				}
			}
			
		}
	  }
 }
