package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11651_좌표_정렬하기2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		StringTokenizer st;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		//e1 : 첫번째 좌표, e1[0] : 첫번째 좌표의 x좌표
		//e2 : 그다음 좌표
		Arrays.sort(arr, (e1, e2)->{
			if(e1[1] == e2[1]) return e1[0] - e2[0];
			else return e1[1] - e2[1];
		});
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i][0]+" "+arr[i][1]);
			System.out.println();
		}

	}

}
