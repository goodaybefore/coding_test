package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2133_타일채우기 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		System.out.println(tiling(N));
	}
	public static Integer tiling(int N) {
		if(N == 0) return 1;
		if(N == 1) return 0;
		if(N == 2) return 3;
		if(N % 2 != 0) return 0;
		if(dp[N] != 0) return dp[N];
		int res = 3 * tiling(N-2);
		for(int i=3;i<=N;i++)
			if(i % 2 == 0) res += 2 * tiling(N-i);
		return dp[N] = res;
	}

}
