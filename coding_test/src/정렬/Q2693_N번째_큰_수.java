package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2693_N번째_큰_수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			Integer arr[] = new Integer[10];
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0;j<10;j++) {
				
				arr[j] = Integer.parseInt(st.nextToken());
			}
//			System.out.println(Arrays.toString(arr));
			sb.append(findThirdMax(arr)).append("\n");
		}
		System.out.println(sb);
	}
	public static Integer findThirdMax(Integer[] arr) {
		Arrays.sort(arr, Collections.reverseOrder());
		return arr[2];
	}

}
