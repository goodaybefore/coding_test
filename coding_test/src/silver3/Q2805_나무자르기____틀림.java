package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Q2805_나무자르기____틀림 {
	static Integer[] trees;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		trees = new Integer[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) trees[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(trees, Collections.reverseOrder());
		
		int left = trees[N-1];
		int right = trees[0];
		int H = 0;
		int mid = (left + right) / 2;
//		System.out.println("left : "+left);
//		System.out.println("right : "+right);
		while(left <= right) {
			mid = (left + right) / 2;
			if(getTrees(mid) >= M) {//더 작아져야함
				System.out.println("mid : "+mid);
				if(getTrees(mid) < getTrees(H))
					H = mid;
				right = mid - 1;
				
				System.out.println("얻을 수 있는 나무 길이 : "+getTrees(mid)+", H : "+H);
			}
			else left = mid + 1;
		}
		System.out.println(H);
	}
	public static int getTrees(int mid) {
		int tree = 0;
		for(int i=0;i<trees.length;i++) {
			if(trees[i] > mid)
				tree = tree + trees[i] - mid;
		}
		return tree;
	}

}
