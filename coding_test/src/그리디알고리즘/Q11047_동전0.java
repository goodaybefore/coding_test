package 그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q11047_동전0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
//		System.out.println("N : "+N);
		Integer coin[] = new Integer[N];
		for(int i=0;i<N;i++) coin[i] = Integer.parseInt(br.readLine());
	
		Arrays.sort(coin, Collections.reverseOrder());
//		System.out.println(Arrays.toString(coin));
		int cnt = 0;
		//K가 0이 될때까지
		while(K != 0) {
			//K가 
			for(int i=0;i<N;i++) {
				if(coin[i] > K) continue;
//				System.out.println("K : "+K);
				K -= coin[i];
				cnt++;
				break;
			}
		}
		System.out.println(cnt);
		

	}

}
