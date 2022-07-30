package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q2960_에라토스테네스의_체 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		boolean[] che = new boolean[N+1];
		for(int i=2;i<=N;i++) {
			for(int j=i;j<=N;j+=i) {
				if(!che[j]) {
					cnt++;
					che[j] = true; 
				}
				if(cnt == K) {
					System.out.println(j);
					return;
				}
			}
		}
	}

}
