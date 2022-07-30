package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11726_2Xn타일링 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 *  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 *  int N = Integer.parseInt(br.readLine());
		 *  dp = new int[1001];
		 *  dp[1] = 1;
		 *  dp[2] = 2;
		 *  for(int i=3;i<=N;i++)
			 *  dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		 *  System.out.println(dp[N]);
		 */
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N =  Integer.parseInt(br.readLine());
		dp = new int[N+1];
//		System.out.println(tiling(N));
		bw.write(Integer.toString(tiling(N)));
		bw.flush();
		bw.close();
		br.close();
		
		
	}
	public static int tiling(int N) {
		if(N == 1) return 1;
		if(N == 2) return 2;
		if(dp[N] != 0) return dp[N];
		return dp[N] = (tiling(N-1) + tiling(N-2)) % 10007;
	}
}
