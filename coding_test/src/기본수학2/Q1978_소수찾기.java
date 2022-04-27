package 기본수학2;

import java.util.Scanner;

public class Q1978_소수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//받을 숫자 개수
		int N = sc.nextInt();
		//받은 숫자 리스트
		int numArr[] = new int[N];
		
		int primeNumbers = 0;
		
		//숫자 받기
		for(int i=0;i<N;i++) numArr[i] = sc.nextInt();
		
		//받은 숫자들 소수검사 하기
		for(int i=0;i<N;i++) {
			if(isPrime(numArr[i])) {
				primeNumbers++; 
			}
		}
		
		System.out.println(primeNumbers);
		
	}
	
	public static boolean isPrime(int Number) {
		if(Number == 1) return false;
		
		//들어온 숫자의 나머지가 0인게 나오면 false
		for(int i=2;i<=Math.sqrt(Number);i++) 
			if(Number % i == 0) return false;
		
		return true;
	}
}
