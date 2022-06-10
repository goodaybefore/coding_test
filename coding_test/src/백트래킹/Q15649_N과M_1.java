package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//N개 중 M개를 구하는 프로그램을 dfs를 이용해 풀기
public class Q15649_N과M_1 {
	
	static int N;
	static int M;
	static boolean visit[];//방문했는지 안했는지 표시
	static int arr[];//몇번인지?
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		visit = new boolean[N];
		dfs(0);
		System.out.println(sb);
	}
	public static void dfs(int depth) {
		//M개 다 골랐으면
		
		if(depth == M) {
			for(int val:arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		//N 중에서 구해야 하니깐 N번 도나?
		for(int i=0;i<N;i++)
			if(!visit[i]) {
				//방문한 적 없는 노드면 true 방문했다고 표시해주기
				visit[i] = true;
				//깊이(depth, M으로 향하는 숫자)를 index로 하여 i+1 값 저장
				arr[depth] = i+1;
				//자식 도느 방문시 depth가 +1 될 것이므로 depth+1 하며 재귀호출
				dfs(depth+1);
				
				//자식노드 방문이 끝나고 돌아오면 방문 노드를 
				visit[i] = false;
//				System.out.println(Arrays.toString(arr));
			}
		//방문한 적 없는 노드면 그냥 i++ 해줘...(다음 노드(숫자)로 넘어가기)
		
	}

}
