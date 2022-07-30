package silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1654_랜선자르기 {
	static long lan[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		lan = new long[K];
		long min = 0;
		long max = 0;
		for(int i=0;i<K;i++) {
			lan[i] = Integer.parseInt(br.readLine());
			if(max < lan[i]) max = lan[i];
		}
		max++;
		
		while(min < max) {
			//중간 길이 구하기
			long mid = min + (max - min) / 2;
			long cnt = 0;
			//중간 길이로 잘라서 몇 개가 만들어지는지 확인
			for(int i=0;i<lan.length;i++)
				cnt += lan[i] / mid;
			
			//upper Bound
			if(cnt < N) max = mid;
			else min = mid + 1;
		}

		System.out.println(max - 1);
		
	}

}
