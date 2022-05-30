package 집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10815_숫자카드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int nArr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nArr);
//		System.out.println(Arrays.toString(nArr));
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			int num = Integer.parseInt(st.nextToken());
			if(binarySearch(nArr, num)) sb.append("1").append(" ");
			else sb.append("0").append(" ");
		}
		System.out.println(sb);

	}
	public static boolean binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1; // arr.length - 1을 해주어야 0~(n-1)번까지 적용가능
		while(low <= high) {
			int mid =(low + high) / 2;
			if(arr[mid] == key) return true;
			else if(arr[mid] > key) high = mid-1;
			else if(arr[mid] < key) low = mid + 1;
		}
		return false;
		
		
	}
	
//	public static int binarySearch(int arr[], int low, int high, int key) {
//		if(low > high) return -1;
//		
//		int mid = low + (high - low) / 2;
//		System.out.println("mid : "+mid+", low : "+low+", high : "+high);
//		if(arr[mid] == key) return mid;
//		else if(arr[mid] > key) return binarySearch(arr, mid-1, high, key);
//		else return binarySearch(arr, low, mid+1, key);
//	}

}
