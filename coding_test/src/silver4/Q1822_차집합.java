package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Q1822_차집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int An = Integer.parseInt(st.nextToken());
		int Bn = Integer.parseInt(st.nextToken());
		TreeSet<Integer> A = new TreeSet<Integer>();
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<An;i++) A.add(Integer.parseInt(st.nextToken()));
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<Bn;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if(A.contains(tmp)) A.remove(tmp);
		}
		System.out.println(A.size());
		for(int a : A) System.out.print(a + " ");

	}

}
