package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Q2981_검문 {

	public static void main(String[] args) throws NumberFormatException, IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int gcdVal = arr[1] - arr[0];
		for(int i=2;i<N;i++) {
			//[1]-[0]의 차이와 [2]-[1]의 차이에 대한 GCD 구하기
			gcdVal = GCD(gcdVal, arr[i] - arr[i-1]);
		}
		for(int i=2;i<=gcdVal;i++) {
			if(gcdVal % i == 0) System.out.print(i + " ");
		}
		
	}
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		return GCD(b, a%b);
	}
}
