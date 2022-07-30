package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1920_수찾기 {
	static int[] arr;
	static int N;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//숫자 배열 만들기
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		//저장할 sb 선언
		StringBuilder sb = new StringBuilder();
		//찾을 숫자들
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			//들어오는 숫자(tmp)에 대한 결과(있으면 1, 없으면 0)
			int tmp = Integer.parseInt(st.nextToken());
//			System.out.println("n : "+tmp+", res : "+binarySearch(tmp));
			sb.append(binarySearch(tmp)).append("\n");
		} 
		System.out.println(sb);
	}
	public static int binarySearch(int n) {
		int left = 0;
		int right = N-1;
		int res = 0;
		while(left <= right) {
			int mid = (left + right) / 2;
			if(arr[mid] < n) {
				left = mid + 1;
			}else if(arr[mid] > n) {
				right = mid - 1;
			}
			else {
				res = 1; break;
			}
		}
		return res;
	}

}
