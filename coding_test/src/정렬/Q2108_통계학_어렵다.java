package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2108_통계학_어렵다 {
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
		int cnt = 0; //중앙값 빈도 누적 수
		int mode_max = 0;//최빈값의 최댓값
		
		//이전의 동일한 최빈값이 1번만 등장했을 경우 ture, 아니면 false
		boolean flag = false;
		
		for(int i=min+4000;i<=max+4000;i++) {
			if(arr[i]>0) {//arr[i(index)]에 값이 1개 이상 존재한다면 
				//중앙값 찾기
				if(cnt < (N+1)/2) { //cnt가 전체 길이의 절반에 못 미친다면
					cnt += arr[i];//arr[i(index)]의 갯수만큼 더해주기
					mid = i - 4000;//index - 4000을 해줘야 원래 숫자값을 가져올 수 있음
				}
			}
			
			/* 최빈값 찾기
			 * 이전 최빈값보다 현재 값의 빈도수가 더 높은 경우
			 */
			if(mode_max < arr[i]) {//제일 많이 등장하는 숫자가 arr[i]의 빈도보다 작을 경우
				mode_max = arr[i];//arr[i]로 mode_max를 대체
				mode = i - 4000;//원래 숫자 값 가져오기
				flag = true;//첫 등장이므로 true
			}else if(mode_max == arr[i] && flag == true) {//제일 많이 등장하는 숫자가 arr[i]와 같고 이전에 등장한 적이 있으면
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
