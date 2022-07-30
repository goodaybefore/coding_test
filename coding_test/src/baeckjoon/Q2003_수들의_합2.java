package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2003_수들의_합2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int p1=0;p1<N;p1++) {
			int sum = arr[p1];
			if(sum == M) { cnt++; continue; }
			//sum이 M보다 크거나 같을 때 까지 반복
			for(int p2=p1+1;p2<N;p2++) {
				sum += arr[p2];
				if(sum == M){ cnt++; break; }
				else if(sum > M) break;
			}
				
		}
		System.out.println(cnt);
		
			
	}

}
