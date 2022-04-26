package 기본수학1;


import java.util.Scanner;

public class Q10250_ACM호텔 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int [] resArray = new int[T];//테스트케이스를 담을 배열
		
		for(int i=0;i<T;i++) {
			int hotelHeight = sc.nextInt();
			int hotelWidth = sc.nextInt();
			int N = sc.nextInt();
			
			int height = 0;
			int width = 1;
			int cnt = 0;

			height = N%hotelHeight;
			width = N/hotelHeight;
			if(N%hotelHeight != 0) width += 1;
			else height = hotelHeight;
			//System.out.println("N번째 손님이 묵을 방");
			//System.out.println("height : "+height*100);
			//System.out.println("width : "+width);
			resArray[i] = height*100+width;
			
		}
		
		for(int tmp:resArray) {
			System.out.println(tmp);
		}
		
		
	}
}
