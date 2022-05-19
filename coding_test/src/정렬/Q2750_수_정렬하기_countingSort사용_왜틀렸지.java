package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2750_수_정렬하기_countingSort사용_왜틀렸지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
//		int N = 30;
//		int arr[] = {1, 3, 2, 4, 3, 2, 5, 3, 1, 2,
//				3,4,4,3,5,1,2,3,5,2,
//				3,1,4,3,5,1,2,1,1,1};
		int count[] = new int[1001];
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
//			System.out.println("i : "+i+", arr[i] " +arr[i]);
			for(int j=1;j<count.length;j++)
				if(arr[i]==j) count[j]++;
		}
//		System.out.println(Arrays.toString(count));
		
		for(int i=1;i<count.length;i++) {
			//count 배열의 i번째 숫자만큼 i를 반복
			if(count[i] != 0) {
//				System.out.println("count[i] : "+count[i]);
				for(int j=0;j<count[i];j++) {
					System.out.println(i);
				}
			}
		}

	}

}
