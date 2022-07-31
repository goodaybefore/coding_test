package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2491_수열 {
	static int upDp[];
	static int downDp[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[N];
		upDp = new int[N];
		downDp = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		
		int max = 1;
		upDp[0] = 1;
		downDp[0] = 1;
		for(int i=1;i<N;i++) {
			if(arr[i-1] < arr[i]) {
				upDp[i] = upDp[i-1] + 1;
				downDp[i] = 1;
			}else if(arr[i-1] > arr[i]) {
				downDp[i] = downDp[i-1] + 1;
				upDp[i] = 1;
			}else {
				downDp[i] = downDp[i-1] + 1;
				upDp[i] = upDp[i-1] + 1;
			}
			max = Math.max(max, Math.max(upDp[i], downDp[i]));
		}
		System.out.println(max);
	}

}
