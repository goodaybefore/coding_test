package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2750_수_정렬하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++) {
				if(arr[i]>arr[j]) {
//					System.out.println("arr[i] : "+arr[i] + ", arr[j] : "+arr[j]);
//					System.out.println(Arrays.toString(arr));
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
//					System.out.println(Arrays.toString(arr));
//					System.out.println();
				}
				
			}
		}

		for(int tmp:arr) {
			System.out.println(tmp);
		}

	}

}
