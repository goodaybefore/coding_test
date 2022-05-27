package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q18870_좌표압축 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int sorted[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			arr[i] = tmp;
			sorted[i] = tmp;
		}
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 0;
		for(int i=0;i<N;i++) {
			if(!map.containsKey(sorted[i])) {
				//map의 key에 sorted[i](찐숫자)를, value(rank)에 rank를
				//key : 찐숫자, value : 순위
				map.put(sorted[i], rank); rank++; 
				
			}
		}
//		System.out.println(map);
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			Integer ranking = map.get(arr[i]);
			sb.append(ranking).append(" ");
		}
		System.out.println(sb);
	}

}
