package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11727_2Xn타일링 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+1];
		//재귀
//		System.out.println(sq(N));
		//반복
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<=N;i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
		}
		System.out.println(dp[N]);
		
	}
	public static int sq(int n) {
		if(n == 1) return 1;
		if(n == 2) return 3;
		
		if(dp[n] == 0) dp[n] = (sq(n-1) + 2*sq(n-2)) % 10007;
		
		return dp[n];
	}
}
