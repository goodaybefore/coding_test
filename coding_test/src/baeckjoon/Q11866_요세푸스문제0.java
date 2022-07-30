package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q11866_요세푸스문제0 {
	static int start = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		LinkedList<Integer> dq= new LinkedList<Integer>();
		for(int i=1;i<=N;i++) dq.addLast(i);
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while(dq.size() > 1) {
			for(int i= 1;i<K;i++) dq.addLast(dq.pollFirst());
			sb.append(dq.poll()).append(", ");
		}
		sb.append(dq.poll()).append(">");
		System.out.println(sb);
	}


}
