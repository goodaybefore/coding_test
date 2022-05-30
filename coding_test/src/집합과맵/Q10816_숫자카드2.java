package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q10816_숫자카드2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(st.nextToken());
//			System.out.println("input : "+input);
			try {
				map.put(input, map.get(input)+ 1);
			} catch(NullPointerException e) {
				map.put(input, 1);
			}
			
		}
		
		
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0;i<M;i++) {
			int input = Integer.parseInt(st.nextToken());
			if(map.get(input) == null) sb.append(0).append(" ");
			else sb.append(map.get(input)).append(" ");
		}
		
		System.out.println(sb);

	}

}
