package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11050_이항계수2 {
	public static final int div = 10007;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		//세로 N+1 //1부터 1000까지
		//가로 1001 //
		long dp[][] = new long[N+1][1001];
		
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=i;j++) {
				if(j == 0) dp[i][j] = 1; //맨 앞(N==i, j==0인 부분)은 전부 1로 지정
				else {
					System.out.println("dp[i][j] : "+dp[i][j]+ ", dp[i-1][j-1] : "+dp[i-1][j-1]+", dp[i-1][j] : "+dp[i-1][j]);
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % div;
				}
			}
		}
		
		System.out.println(dp[N][K] % div);
		
	}
	
	
}
