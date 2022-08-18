package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q9613_GCD합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int arr[] = new int[N];
			for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
			
			long sum = 0;
			for(int i=0;i<N;i++) {
				for(int j=i;j<N;j++) {
					if(i != j) sum += gcd(arr[i], arr[j]);
				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
	public static int gcd(int a, int b) {
		if(b==0) return a;
		else return gcd(b, a % b); 
	}
}
