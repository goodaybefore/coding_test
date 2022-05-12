package 브루트포스;

import java.util.Arrays;
import java.util.Scanner;

public class Q2798_블랙잭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] nArr = new int[N];
		for(int i=0;i<N;i++) {
			nArr[i] = sc.nextInt();
		}
		
		int a, b, c;
		int max = 0;
		for(int i=0;i<N;i++) {
			int sum = 0;
			for(int j=i+1;j<N;j++) {
				for(int k=j+1;k<N;k++) {
//					System.out.println("nArr[i] : "+nArr[i]+", nArr[j] : "+nArr[j]+", nArr[k] : "+nArr[k]);
					sum = nArr[i] + nArr[j] + nArr[k];
//					System.out.println("sum : "+sum);
//					System.out.println();
					if(sum>max && sum<=M) max = sum;
				}
			}
		}
		System.out.println(max);
		
	}

}
