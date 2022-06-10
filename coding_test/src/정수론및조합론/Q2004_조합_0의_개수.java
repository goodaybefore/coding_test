package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2004_조합_0의_개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt5 = numPower(5, N) - numPower(5, N-M) - numPower(5, M);
		int cnt2 = numPower(2, N) - numPower(2, N-M) - numPower(2, M);
		System.out.println(Math.min(cnt5, cnt2));
		
		
		
	}
	public static int numPower(int exponent, int num) {
		//exponent : 밑, 여기서는 2 or 5
		//num : 지수를 구할 때 쓰는 숫자(여기서는 N, M)
		int cnt = 0;
		while(num >= exponent) {
			cnt += num/exponent;
			num /= exponent;
		}
		return cnt;
	}

}
