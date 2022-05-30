package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q14425_문자열집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int cnt = 0;
		
		for(int i=0;i<N;i++) map.put(br.readLine(), i);

		for(int i=0;i<M;i++) {
			String tmp = br.readLine();
			if(map.containsKey(tmp)) cnt++;
		}
		System.out.println(cnt);
		//틀렸다는데 왜 틀렸는지 모르겠네...
//		String sArr[] = new String[N];
//		String inputArr[] = new String[M];
//		int cnt = 0;
//		
//		for(int i=0;i<N;i++) sArr[i] = br.readLine();
//		for(int i=0;i<M;i++) inputArr[i] = br.readLine();
//		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++) {
//				if(sArr[i].equals(inputArr[j])) {
//					cnt++;
//					break;
//					
//				}
//			}
//		}
//		System.out.println(cnt);
		

	}

}
