package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2798_블랙잭2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int res = 0;
		for(int i=0;i<N;i++) {
//			int sum=0;
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
					int sum = arr[i]+arr[j]+arr[k];
					if(sum>res && sum <= M) {
//						System.out.println("arr[i] : "+arr[i]);
//						System.out.println("arr[j] : "+arr[j]);
//						System.out.println("arr[k] : "+arr[k]);
//						System.out.println();
						res = sum;
					}
				}
			}
		}
		


		System.out.println(res);
		
	}
}
