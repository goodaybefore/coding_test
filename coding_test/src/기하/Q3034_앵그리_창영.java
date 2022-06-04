package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q3034_앵그리_창영 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int arr[] = new int[N];
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			int length = Integer.parseInt(br.readLine());
			double dae = Math.sqrt(Math.pow(W, 2)+Math.pow(H, 2));
			if(length <= dae || length<=W || length<=H) sb.append("DA").append("\n");
			else sb.append("NE").append("\n");
		}
		System.out.println(sb);
	}

}
