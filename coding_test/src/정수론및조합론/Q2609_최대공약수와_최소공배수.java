package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Q2609_최대공약수와_최소공배수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		if(A >= B) {
			sb.append(GCD(A, B)).append("\n");
			sb.append(LCM(A, B)).append("\n");
		}else {
			sb.append(GCD(B, A)).append("\n");
			sb.append(LCM(B, A)).append("\n");
		}
		System.out.println(sb);
	}
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
	}
	public static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}

}
