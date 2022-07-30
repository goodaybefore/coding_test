package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;



public class Q2407_조합 {
	static int dp[][];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		
		for(int i=0;i<M;i++) {
			n1 = n1.multiply(new BigInteger(String.valueOf(N-i)));
			n2 = n2.multiply(new BigInteger(String.valueOf(i+1)));
		}
		BigInteger ans = n1.divide(n2);
		System.out.println(ans.toString());
		
	}
}
