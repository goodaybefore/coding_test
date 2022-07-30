package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q1920_수찾기 {
	static int[] nArr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		nArr = new int[N]; 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) nArr[i] = Integer.parseInt(st.nextToken());

		Arrays.sort(nArr);
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) sb.append(1).append("\n");
			else sb.append(0).append("\n");
		}
		System.out.println(sb);
		

		
	}
	public static int binarySearch(int key) {
		int start = 0; int end = nArr.length-1;
		while(start <= end) {
			int mid = (end - start) / 2 + start;
//			int mid = (end + start) / 2;
			if(key > nArr[mid]) start = mid + 1;
			else if(key < nArr[mid]) end = mid - 1;
			else return 1;
		}
		return -1;
	}

}
