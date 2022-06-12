package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1914_하노이_탑 {
	static int K = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		hanoi(N, 1, 2, 3);
		System.out.println(K);
		if(N <= 20) System.out.println(sb);
	}
	public static void hanoi(int N, int from, int other, int to) {
		if(N == 1) {
			sb.append(from).append(" ").append(to).append("\n");
			K++;
			return;
		}
		K++;
		hanoi(N-1, from, to, other);
		sb.append(from).append(" ").append(to).append("\n");
		hanoi(N-1, other, from, to);
	}
}
