package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2309_일곱난쟁이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int height[] = new int[9];
		for(int i=0;i<height.length;i++)
			height[i] = Integer.parseInt(br.readLine());
		Arrays.sort(height);
//		System.out.println(Arrays.toString(height));
		int n1 = 0;
		int n2 = 0;
		
		for(int i=0;i<height.length-1;i++) {
			for(int j=i+1;j<height.length;j++) {
				if(heightSum(i,j,height) == 100) {
					n1 = i; n2 = j; break;
				}
			}
		}
//		System.out.println(Arrays.toString(height));
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<9;i++) {
			if(i != n1 && i != n2) sb.append(height[i]).append("\n");
		}
		System.out.println(sb);
	}
	public static int heightSum(int i, int j, int[] arr) {
		int sum = 0;
		for(int k=0;k<arr.length;k++) {
			if(k == i || k == j) continue;
			sum += arr[k];
		}
		return sum;
	}

}
