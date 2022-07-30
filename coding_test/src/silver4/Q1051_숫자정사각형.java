package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1051_숫자정사각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] arr = new int[N][M];
		int area = 0;
		int maxArea = 0;
		final int MIN  =Math.max(N, M);
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		
		
		//가능한 모든 정사각형을 완전탐색으로 찾기
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				for(int k=0;k<MIN;k++) {
					//배열 범위 안이라면
					if(i+k < N && j+k< M) {
						if(arr[i][j] == arr[i][j+k] && arr[i][j] == arr[i+k][j] && arr[i][j] == arr[i+k][j+k]) {
							area = (k+1) * (k+1);
							maxArea = Math.max(maxArea, area);
						}
					}
				}
			}
		}
		System.out.println(maxArea);
		br.close();

	}

}
