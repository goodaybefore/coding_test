package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q1934_최소공배수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			sb.append(LCM(A,B)).append("\n");
		}
		
		System.out.println(sb);
	}
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
	}
	public static int LCM(int a, int b) {
		return a * b / (GCD(a, b));
	}

}
