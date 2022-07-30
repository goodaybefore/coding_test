package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9095_123더하기___ {
	static int dp[] = new int[11];
	static int cnt = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<T;i++) {
			int N = Integer.parseInt(br.readLine());
			plusWay(N-1);
			plusWay(N-2);
			plusWay(N-3);
			sb.append(cnt).append("\n");
			cnt = 0;
			
		}
		System.out.println(sb);
		br.close();
	}
	public static void plusWay(int N) {
		if(N < 0) return;
		if(N == 0) {
			cnt++; return;
		}
		plusWay(N-1);
		plusWay(N-2);
		plusWay(N-3);
		
	}

}
