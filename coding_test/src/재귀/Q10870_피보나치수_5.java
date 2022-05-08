package 재귀;

import java.util.Scanner;

public class Q10870_피보나치수_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = Pibo(N);
		System.out.println(sum);
	}

	public static int Pibo(int N) {
//		System.out.println("N : "+N);
		if(N == 0) return 0;
		if(N == 1) return 1;
		
		else {
			int sum = Pibo(N-1) + Pibo(N-2);
			return sum;
		}
	}
}
