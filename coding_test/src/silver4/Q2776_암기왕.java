package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2776_암기왕 {
	static StringBuilder sb = new StringBuilder();
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			remember();
		}
		System.out.println(sb);
	}
	
	public static void remember() throws NumberFormatException, IOException {

		int a = Integer.parseInt(br.readLine());
		int arr[] = new int[a+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<a;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int b = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<b;i++) {
			int n = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = a;
			boolean check = false;
			
			while(start <= end) {
				int mid = start + (end - start)/2;
				
				if(n < arr[mid]) {
					end = mid - 1;
				}else if(n > arr[mid]){
					start = mid + 1;
				}else {
					check = true;
					break;
				}
			}
			
			sb.append(check ? 1 : 0).append("\n");
//			if(binarSearch(arr2[i], arr)) sb.append("1").append("\n");
//			else sb.append("0").append("\n");
		}
		
	}
}
