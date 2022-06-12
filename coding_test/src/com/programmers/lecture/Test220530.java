package com.programmers.lecture;

import java.util.Arrays;

public class Test220530 {

	public static void main(String[] args) {
		long n = 12345;
		solution(n);
	}
	public static int[] solution(long n) {
		int[] answer = {};
		long N = n;
		int length = 0;
		
		while(N != 0) {
//			System.out.println("N%10 : "+N%10);
			N /= 10;
//			System.out.println(N);
			length++;
		}
		N = n;
		answer = new int[length];
		for(int i=0;i<answer.length;i++) {
			answer[i] = (int) (N%10);
			N /= 10;
		}
//		System.out.println(Arrays.toString(answer));
		return answer;
	}
}

