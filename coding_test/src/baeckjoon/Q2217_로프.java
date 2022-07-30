package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q2217_로프 {
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int arr[] = new int[N+1];
		for(int i=1;i<=N;i++) arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int max = arr[N];
		for(int i=1;i<N;i++) {;
			max = Math.max(max, arr[i] * (N - (i-1)));
		}
		System.out.println(max);
	}
	

}
