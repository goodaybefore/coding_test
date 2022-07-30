package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9461_파도반_수열 {
	static long[] dp = new long[101];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			sb.append(padovan(N)).append("\n");
		}
		System.out.println(sb);
	}
	public static long padovan(int n) {
		if(dp[n] != 0) return dp[n];
		else return dp[n] = padovan(n-2) + padovan(n-3);
	}

}
