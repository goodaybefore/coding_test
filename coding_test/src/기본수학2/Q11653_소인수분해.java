package 기본수학2;

import java.util.Scanner;


public class Q11653_소인수분해 {

	public static void main(String[] args) {
		//기본적으로 약수 구하는걸 응용
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=2;i<=Math.sqrt(N);i++) {
			while(N%i == 0) {
//				System.out.println(N+"/"+i+"=="+N/i);
				System.out.println(i);
				N /= i;
			}
		}
		
		if(N!=1) System.out.println(N);

	}

}
