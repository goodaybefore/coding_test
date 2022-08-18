package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5347_LCM {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(LCM(a, b)).append("\n");
		}
		System.out.println(sb);
	}
	public static int GCD(int a, int b) {
		if(a%b == 0) return b;
		return GCD(b, a%b);
	}
	public static int LCM(int a, int b) {
		int gcd = GCD(a, b);
		return gcd * (a/gcd) * (b/gcd);
	}
}
