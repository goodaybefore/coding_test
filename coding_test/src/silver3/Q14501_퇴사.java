package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14501_퇴사 {
	static int dp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dp = new int[N+10];
		int t[] = new int[N+10];
		int p[] = new int[N+10];
		StringTokenizer st;
		for(int i=1;i<=N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		for(int i=1;i<=N+1;i++) {
			dp[i] = Math.max(dp[i], max);
			
			//이전에 저장된 최대 수익 VS 이번 움직임으로 생긴 최대 수익
			dp[t[i]+i] = Math.max(dp[t[i]+i], p[i] + dp[i]);
			
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);

	}

}
