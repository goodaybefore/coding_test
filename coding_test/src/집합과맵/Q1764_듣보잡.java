package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Q1764_듣보잡 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
//		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		for(int i=0;i<N;i++) {
			String name = br.readLine();
			map.put(name, i);
		}
		StringBuilder sb = new StringBuilder();
		
		List<String> list = new ArrayList<String>();
		int index = 0;
		for(int i=0;i<M;i++){
			String name = br.readLine();
			if(map.containsKey(name)) {
				list.add(name);
			}
		}
		
		Collections.sort(list);
		for(String tmp : list) sb.append(tmp).append("\n");
		System.out.println(list.size());
		System.out.println(sb);
		
	}

}
