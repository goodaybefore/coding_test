package 기본수학2;

import java.util.Scanner;

public class Q2581_소수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//M이 N보다 작거나 같음
		int M = sc.nextInt();
		int N = sc.nextInt();

		//소수의 개수
		int minPrime = -1;
		//최소 소수
		int primeSum = 0;
		
		//M과 N의 차이
		//int length = N-M;
		
		//M부터 N까지 증가
		for(int m=M;m<=N;m++) {
			//System.out.println("for문 : 현재  숫자 "+m);
			if(isPrime(m)) {
				//System.out.print(m+" ");
				primeSum += m;
				if(minPrime == -1) minPrime = m;
			}
		}
		
		if(minPrime == -1) {
			System.out.println(minPrime);
		}
		else {
			System.out.println(primeSum);
			System.out.println(minPrime);
		}
	}
	public static boolean isPrime(int Number) {
		if(Number == 1) return false;
		
		for(int i=2;i<=Math.sqrt(Number);i++) {
			if(Number%i == 0) return false;
		}
		
		return true;
	}
}
