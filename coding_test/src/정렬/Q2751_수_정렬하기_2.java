package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751_수_정렬하기_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0;i<N;i++) arr.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(arr);
//		//오름차순 정렬
//		for(int i=0;i<N-1;i++) {
//			for(int j=i+1;j<N;j++) {
//				if(arr[i] > arr[j]) {
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
		for(int i=0;i<N;i++) sb.append(arr.get(i)).append("\n");
		System.out.println(sb);
		

	}

}
