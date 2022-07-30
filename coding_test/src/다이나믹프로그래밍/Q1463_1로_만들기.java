package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1463_1로_만들기 {
	static Integer[] dp;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new Integer[n+1];
		dp[0] = dp[1] = 0;
		System.out.println(recur(n));
		
	}
	public static int recur(int n) {
		
		if(dp[n] == null) {
			//2나 3으로 나눠지는 경우 : (recur(2로나눈몫)과 recur(3으로나눈몫)의 min)을 recur(n-1)과 비교해서 최소값 구하고 +1해주기
			if(n % 6 == 0) dp[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
			//3으로만 나눠지는 경우
			else if(n % 3 == 0) dp[n] =  Math.min(recur(n/3), recur(n-1))+1;
			//2로만 나눠지는 경우
			else if(n % 2 == 0) dp[n] =  Math.min(recur(n/2), recur(n-1))+1;
			//3, 2로 나누어지지 않는 경우
			else dp[n] = recur(n-1)+1;
		}
		return dp[n];
	}

}
