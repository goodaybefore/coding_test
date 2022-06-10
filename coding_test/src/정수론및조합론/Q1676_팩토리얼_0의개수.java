package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1676_팩토리얼_0의개수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int fact = factorial(N);
		
		int cnt = 0;
		
		while(N >= 5) {
//			System.out.println(N);
			cnt += N/5;
			N/= 5;
			
		}
		System.out.println(cnt);

	}
	public static int factorial(int n) {
		if(n == 0) return 1;
		return n * factorial(n-1);
	}

}
