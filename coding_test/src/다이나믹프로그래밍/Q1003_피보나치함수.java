package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003_피보나치함수 {
//	static int cnt0 = 0;
//	static int cnt1 = 0;
	static Integer[][] dp = new Integer[41][2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		dp[0][0] = 1; // N=0 일 때 0의 호출 횟수
		dp[0][1] = 0; // N=0 일 때 1의 호출 횟수
		dp[1][0] = 0; // N=1 일 때 0의 호출 횟수
		dp[1][1] = 1; // N=1 일 때 1의 호출 횟수
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			fibo(N);
			sb.append(dp[N][0]).append(" ").append(dp[N][1]).append("\n");
		}
		System.out.println(sb);
	}
	public static Integer[] fibo(int n) {
		
		//n에 대한 0의 호출 횟수가 null 이거나 1의 호출 횟수가 null이라면(탐색하지 않은 값이라면)
		if(dp[n][0] == null || dp[n][1] == null) {
			//각 N에 대한 0의 호출 횟수와 1의 호출 횟수를 재귀호출
			dp[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
			dp[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
		}
		return dp[n];
	}
}
