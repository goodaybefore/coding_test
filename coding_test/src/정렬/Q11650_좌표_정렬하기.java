package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Q11650_좌표_정렬하기 {

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
		
		
//		Arrays.sort(arr, new Comparator<int[]>(){
//			@Override
//			public int compare(int[] e1, int[] e2) {
//				if(e1[0] == e2[0]) return e1[1] - e2[1];
//				else return e1[0] - e2[0];
//			}
//		});
		
		//위 Arrays.sort를 람다식으로
		//e1 : 앞좌표, e2 : 뒷좌표
		//e1[0] : 앞좌표의 x좌표, e1[1]  : 앞좌표의 y좌표
		Arrays.sort(arr, (e1, e2)->{
//			System.out.println("e1[0] : "+e1[0]);
//			System.out.println("e2[0] : "+e2[0]);
//			System.out.println("e1[1] : "+e1[1]);
//			System.out.println("e2[1] : "+e2[1]);
//			System.out.println("e1[0] - e2[0] : "+(e1[0] - e2[0]));
//			System.out.println("e1[1] - e2[1] : "+(e1[1] - e2[1]));
//			System.out.println();
			//앞좌표의 x좌표가 뒷좌표의 x좌표와 같다면
			if(e1[0] == e2[0]) return e1[1] - e2[1]; // 앞좌표의 y좌표 - 뒷좌표의 y좌표
			else return e1[0] - e2[0]; // 앞좌표의 x좌표 - 뒷좌표의 x좌표
		});
		
		for(int i=0;i<N;i++) {
			System.out.print(arr[i][0] + " " + arr[i][1]);
			System.out.println();
		}
		

	}
}