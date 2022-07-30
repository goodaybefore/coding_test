package 그래프;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Q1260_DFS와BFS {
	static int[][] graph = new int[1001][1001];
	static boolean[] visit= new boolean[1001];
	static int N;
	static int M;
	static int V;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		for(int i=0;i<M;i++) {
			st =  new StringTokenizer(br.readLine()," ");
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			graph[n1][n2] = graph[n2][n1] = 1;
		}
		
		DFS(V);
		System.out.println(sb);
		sb.setLength(0);//StringBuilder 초기화
		visit = new boolean[1001];//visit 상태 초기화
		BFS(V);
		System.out.println(sb);
		
	}
	public static void BFS(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		//시작점 방문 표시
		visit[start] = true;
		//시작점을 que에 넣기
		que.offer(start);
		
		//정답 출력할거 넣기
		sb.append(start).append(" ");
		
		while(!que.isEmpty()) {
			int n = que.poll();
			for(int i=1;i<=N;i++) {
				if(graph[n][i] == 1 && !visit[i]) {
					que.offer(i);
					visit[i] = true;
					sb.append(i).append(" ");
				}
			}
		}
		
	}
	public static void DFS(int start) {//Stack
		visit[start] = true;//첫번째꺼 방문표시
		sb.append(start).append(" ");
		for(int i=1;i<=N;i++) {
			//graph의 시작점과 i점이 연결되어있고, 아직 i점을 방문하지 않았을 때
			//i점을 시작점으로 삼는 DFS를 한 번 더 수행
			//그럼 다시 for문으로 돌아와서 시작점(i)와 i'점이 연결되어있고 + 아직 i'점을 방문하지 않았는지 확인하고,
			//그렇다면 또 i'점을 시작점으로 삼는 DFS 실행
			if(graph[start][i] == 1 && !visit[i]) DFS(i);
			//start와 i점이 연결되어 있지 않거나, i점에 방문표시가 되어있을 경우 다음 점(i+1)점으로 넘어감
		}
		
	}
	
	

}
