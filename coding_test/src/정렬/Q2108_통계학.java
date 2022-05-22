package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2108_통계학 {
	//
	public static void main(String[] args) throws NumberFormatException, IOException {
		//숫자 N이 주어졌을 때 산술평균, 중앙값, 최빈값, 범위를 구하는 프로그램을 작성
		//1 산술평균 : N개의 수들의 합을 N으로 나눈 값
		//2 중앙 값 : N개의 수를 내림차순으로 나열했을 경우 중앙에 위치하는 값
		//3 최빈값 : N개의 수 중 가장 많이 나타나는 값
		//4 범위 : N개의 수 중 최댓값-최솟값
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[8001];
		
		double sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mid = 10000;
		int mode = 10000;
		
		for(int i=0;i<N;i++) {
			int val = Integer.parseInt(br.readLine());
			sum += val;
			//counting sort
			arr[val + 4000]++;//-1을 넣으면 3999, -4000을 넣으면 0
			
			if(max<val) max = val;
			if(min>val) min = val;
		}
		
		
		//순회
		int cnt = 0;
		int mode_max = 0;
		
		//이전의 동일한 최빈값이 1번만 등장했을 경우 ture, 아니면 false
		boolean flag = false;
		
		for(int i=min+4000;i<=max+4000;i++) {
			if(arr[i]>0) {
				System.out.println("arr[i] : "+arr[i]);
				/* 중앙값 찾기
				 * 누적 횟수가 전체 길이의 절반에 못 미친다면
				 */
				if(cnt < (N+1)/2) {
					cnt += arr[i];
					mid = i - 4000;
				}
			}
			
			/* 최빈값 찾기
			 * 이전 최빈값보다 현재 값의 빈도수가 더 높은 경우
			 */
			if(mode_max < arr[i]) {
				mode_max = arr[i];
				mode = i - 4000;
				flag = true;//첫 등장이므로 true
			}else if(mode_max == arr[i] && flag == true) {
				mode = i - 4000;
				flag = false;
			}
		}
		
		System.out.println((int)Math.round((double)sum/N));
		System.out.println(mid);
		System.out.println(mode);
		System.out.println(max-min);
		
	}

}
