package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1149_RGB거리 {
	
	final static int Red = 0;
	final static int Green = 1;
	final static int Blue = 2;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] Cost = new int[N+1][3];
		
		for(int i=1;i<N+1;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Cost[i][Red] = Integer.parseInt(st.nextToken());
			Cost[i][Green] = Integer.parseInt(st.nextToken());
			Cost[i][Blue] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=2;i<=N;i++) {
			Cost[i][Red] += Math.min(Cost[i-1][Green], Cost[i-1][Blue]);
			Cost[i][Green] += Math.min(Cost[i-1][Red], Cost[i-1][Blue]);
			Cost[i][Blue] += Math.min(Cost[i-1][Green], Cost[i-1][Red]);
		}
		System.out.println(Math.min(Math.min(Cost[N][Red], Cost[N][Green]), Cost[N][Blue]) );
		
	}

}
