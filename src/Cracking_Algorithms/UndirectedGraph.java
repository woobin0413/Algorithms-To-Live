package Cracking_Algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

//https://blog.naver.com/metalingus58/221375775247
//https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

/**
 * BufferedReader
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * 한번에 다량으로 가져와 캐릭터 버퍼링을 하여 
 * 속도가 스케너 보다 빠르다.
 */
public class UndirectedGraph {

	static int v, e;
	static ArrayList<Integer>[] con, conv;
	
	public static void main(String[] args) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//특정 문자로 구분되어있는 문자열을 아주 쉽게 처리할 수 있다
	StringTokenizer st = new StringTokenizer(br.readLine());
	//v = node, e = edge
	v = Integer.parseInt(st.nextToken());
	e = Integer.parseInt(st.nextToken());
	
	con = new ArrayList[v+1];
	conv = new ArrayList[v+1];
	
	//Node 만큼 array 생성
	for (int i = 1; i<=v; i++) {
		con[i] = new ArrayList<>();
		conv[i] = new ArrayList<>();
	}
	//Edge 만들때
	//a->b, b->a
	for (int i = 1; i <= e; i++) {
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		int c = Integer.parseInt(st1.nextToken());
		//conv 는 가중치 관리용 arraylist 이며
		//출발점, 도착점 가중치 모두 관리된다.
		con[a].add(b);
		conv[a].add(c);
		
		con[b].add(a);
		conv[b].add(c);
	}
	
	}
}

