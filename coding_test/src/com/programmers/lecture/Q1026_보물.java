package com.programmers.lecture;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1026_보물 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		int B[] = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) A[i] = Integer.parseInt(st.nextToken());
		st= new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) B[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(B);
		Arrays.sort(A);
		
		int S = 0;
		for(int i=0, j=N-1;i<N && j>=0;i++, j--) {
			S += A[i] * B[j];
		}
		System.out.println(S);
	}

}
