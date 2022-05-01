package 기본수학2;

import java.util.Arrays;
import java.util.Scanner;

public class Q9020_골드바흐의_추측 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] up = new int[T];
		int[] down = new int[T];

		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			up[i] = N / 2;
			down[i] = 1;
			
			while(up[i]<=N) {
				//up이 소수이면 down을 구해보기
				if(isPrime(up[i])) {
					down[i] = N - up[i];
					if(isPrime(down[i])) break; //up과 down 모두 소수이면 break;
				}
				up[i]++;
			}
		}

//		System.out.println("up : "+Arrays.toString(up));
//		System.out.println("down : "+Arrays.toString(down));
		for(int i=0;i<T;i++) {
			System.out.println(down[i]+" "+up[i]);
		}
		
		
	}
	public static boolean isPrime(int Number) {
		if(Number == 1) return false;
		for(int i=2;i<=Math.sqrt(Number);i++)
			if(Number % i == 0) return false;
		return true;
	}

}
