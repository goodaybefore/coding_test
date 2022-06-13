package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q3273_두_수의_합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		int front = 0;
		int back = arr.length-1;
		int cnt = 0;
		int sum = 0;
//		System.out.println(Arrays.toString(arr));
		while(front < back) {
			//앞쪽 포인터와 뒤쪽 포인터가 같거나 절반 이상 지나왔으면 break;
			//두 수의 합이 X와 같으면 cnt++
//			System.out.println("front : "+front + ", back " +back);
//			System.out.println("앞쪽 숫자 : "+arr[front]+", 뒤쪽숫자 : "+arr[back]);
			sum = arr[front] + arr[back];
			if(sum == X) cnt++;
			if(sum <= X) front++;
			else back--;
			
		}
		System.out.println(cnt);
	}

}
