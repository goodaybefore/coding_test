package 집합과맵;
//22-06-01
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q1269_대칭차집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<A;i++) {
			int num = Integer.parseInt(st.nextToken());
			map.put(num, num);
		}
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<B;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(!map.containsKey(num)) map.put(num, num);
			else map.remove(num, num);
			
		}
		
//		System.out.println("map A : " + mapA);
//		System.out.println("map B : " + mapB);
//		System.out.println("same : " + same);

		System.out.println(map.size());
	}
}
