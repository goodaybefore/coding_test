package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606_바이러스 {
	static boolean visit[];
	static int arr[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st;
		arr = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}
		
		System.out.println("arr.length : "+arr.length);
		Queue<Integer> que = new LinkedList<>();
		//감염된 컴퓨터 수
		int cnt = 0;
		que.offer(1);
		while(!que.isEmpty()) {
			int now = que.poll();
			for(int i=1;i<=N;i++) {
				if(arr[now][i] == 1 && !visit[i]) {
					que.offer(i);
					visit[i] = true;
					cnt++;
				}
			}
		}
		System.out.println(cnt-1);
		
		
	}
}
