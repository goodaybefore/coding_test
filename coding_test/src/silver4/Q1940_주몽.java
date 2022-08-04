package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1940_주몽 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[N];
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int p1=0;p1<N-1;p1++) {
			for(int p2=p1+1;p2<N;p2++) {
				if(arr[p1] + arr[p2] == M) cnt++; 
			}
		}
		
		System.out.println(cnt);
	}

}
