package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021_회전하는_큐 {
	static int now = 0 ;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[M];
		LinkedList<Integer> que = new LinkedList<Integer>();
		for(int i=1;i<=N;i++) que.add(i);
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0;i<M;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int i=0;i<M;i++) {
			int target_idx = que.indexOf(arr[i]);
			
			int half_idx;
			if(que.size() % 2 == 0) half_idx = que.size()/2 -1;
			else half_idx = que.size()/2;
			
			if(target_idx <= half_idx) {
				for(int j=0;j<target_idx;j++) {
					que.offerLast(que.pollFirst());
					cnt++;
				}
			}else {
				for(int k = 0;k<que.size() - target_idx;k++) {
					que.offerFirst(que.pollLast());
					cnt++;
				}
			}
			que.pollFirst();
		}
		
		System.out.println(cnt);

	}
}
