package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1904_01타일 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		
		//재귀
//		for(int i=0;i<=N;i++) dp[i] = -1;
//		dp[0] = 1;
//		dp[1] = 1;
		
		
		System.out.println(tile(N));
		
	}
	//재귀
//	public static int tile(int n) {
//		if(dp[n] == -1) dp[n] = (tile(n-1) + tile(n-2)) % 15746;
//		return dp[n];
//	}
	//for문
	public static int tile(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		int v1 = 1;
		int v2 = 2;
		int sum = 0;
		
		for(int i=2;i<n;i++) {
			sum = (v1 + v2) % 15746;
			v1 = v2;
			v2 = sum;
		}
		return sum;
	}
	
}