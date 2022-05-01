package 기본수학2;

import java.util.Scanner;

public class Q1929_소수구하기_에라토스테네스의체 {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(); 
		int N = sc.nextInt();
		
		boolean[] arr= new boolean[N+1]; 
		arr[0] = arr[1] = true;
		
		for(int i=2;i<=N;i++) {
			if(arr[i] == true) continue;
			for(int k=2; i*k<=N; k++) {
				arr[i*k] = true;
			}
		}
		for(int i=M;i<=N;i++) {
			if(arr[i] == false) System.out.println(i);
		}
	}

	
	
	//틀림.. ArrayInedxOutOfBoundsException 나옴....ㅠㅠ
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		int M = sc.nextInt();
//		int N = sc.nextInt();
//		boolean[] arr;
//		if(M==1 && N == 1) arr = new boolean[N+1]; 
//		else arr= new boolean[N+1];
//		arr[0] = arr[1] = true;//0과 1은 true 처리 미리 해주기.. 아니면 대참사
//		
//		/*
//		 * 1. M~N 사이의 모든 수 중에서 2의 배수 지우기
//		 * 2. 남아있는 수 중에서 제일 작은 수의 배수 지우기
//		 * */
//		
//		for(int i=2; i<=N; i++) {
//			System.out.println("hi1");
//			if(arr[i] == true) continue;
//				if(i<=M) {
//					for(int j=i*i; j<=N; j+=i) {
//						System.out.println("hi2");
//						arr[j] = true;
//					}
//						
//			}
//		}
//		for(int i=M;i<=N;i++) {
//			if(arr[i] == false) System.out.println(i);
//		}
//	}

}
