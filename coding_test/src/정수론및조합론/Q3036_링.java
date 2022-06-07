package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3036_링 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<N;i++) {
			int gcdVal = GCD(arr[i], arr[0]);
			sb.append(arr[0]/gcdVal).append("/").append(arr[i]/gcdVal).append("\n");
		}
		System.out.println(sb);
	}
	public static int GCD(int a, int b) {
		if(a < b) {
			int tmp = b;
			b = a;
			a = tmp;
		}
		if(b == 0) return a;
		return GCD(b, a%b);
	}
}
