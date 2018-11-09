package Cracking_Algorithms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
//https://blog.naver.com/metalingus58/221378577523
public class Breadth_First_Search {

	static ArrayList<Integer>[] con;
	
	public static void main(String[] args) throws Exception{
		
		//7개의 정점을 만든다
		con = new ArrayList[8];

		for (int i = 0; i<con.length; i++) {
			con[i] = new ArrayList<>();	
			
		}
		
		//단방향 그래프로 자식의 정점도 추가
		con[1].add(2);
		con[1].add(3);
		con[1].add(7);
		con[2].add(4);
		con[3].add(5);
		con[3].add(6);
		
		//큐에 1번 정점 추가
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		
		//큐가 비어있지 않다면 첫번쨰 poll한뒤 값을 받아서
		//출력 후 큐에서 삭제한다
		//1 [2,3,7] 2 [4] 3 [5,6]
		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.println("Node : " + node);
			
			for (int i = 0; i < con[node].size(); i++) {
				queue.add(con[node].get(i));
			}
			
		}
	}
}

