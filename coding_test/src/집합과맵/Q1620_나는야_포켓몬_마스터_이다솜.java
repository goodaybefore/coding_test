package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;


public class Q1620_나는야_포켓몬_마스터_이다솜 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map_int = new HashMap<Integer, String>();
		HashMap<String, Integer> map_str = new HashMap<String, Integer>();
		
		for(int i=1;i<=N;i++) {
			String name = br.readLine();
			map_int.put(i, name);
			map_str.put(name, i);
		}
//		System.out.println();
		StringBuilder sb = new StringBuilder();		
		
		for(int i=0;i<M;i++) {
			String search = br.readLine();
			if(isInteger(search)) {//문자열이 들어왔으면
//				System.out.println("숫자가 들어왔음! "+map_int.get(Integer.parseInt(search)));
				sb.append(map_int.get(Integer.parseInt(search))).append("\n");
			}else {//숫자가 들어왔으면
				sb.append(map_str.get(search)).append("\n");
			}
		}
		System.out.println(sb);

	
	
	}
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
	