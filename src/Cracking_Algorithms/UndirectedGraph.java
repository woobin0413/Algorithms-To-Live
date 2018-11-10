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
 * �ѹ��� �ٷ����� ������ ĳ���� ���۸��� �Ͽ� 
 * �ӵ��� ���ɳ� ���� ������.
 */
public class UndirectedGraph {

	static int v, e;
	static ArrayList<Integer>[] con, conv;
	
	public static void main(String[] args) throws Exception {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//Ư�� ���ڷ� ���еǾ��ִ� ���ڿ��� ���� ���� ó���� �� �ִ�
	StringTokenizer st = new StringTokenizer(br.readLine());
	//v = node, e = edge
	v = Integer.parseInt(st.nextToken());
	e = Integer.parseInt(st.nextToken());
	
	con = new ArrayList[v+1];
	conv = new ArrayList[v+1];
	
	//Node ��ŭ array ����
	for (int i = 1; i<=v; i++) {
		con[i] = new ArrayList<>();
		conv[i] = new ArrayList<>();
	}
	//Edge ���鶧
	//a->b, b->a
	for (int i = 1; i <= e; i++) {
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st1.nextToken());
		int b = Integer.parseInt(st1.nextToken());
		int c = Integer.parseInt(st1.nextToken());
		//conv �� ����ġ ������ arraylist �̸�
		//�����, ������ ����ġ ��� �����ȴ�.
		con[a].add(b);
		conv[a].add(c);
		
		con[b].add(a);
		conv[b].add(c);
	}
	
	}
}

