package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1010_다리놓기 {
	static int dp[][] = new int [30][30];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			sb.append(combi(M,N)).append("\n");
		}
		System.out.println(sb);
	}
	public static int combi(int n, int r) {
		if(dp[n][r]>0) return dp[n][r];
		if(n==r || r==0) return dp[n][r] = 1;
		return dp[n][r] = combi(n-1, r-1) + combi(n-1, r);
	}

}
