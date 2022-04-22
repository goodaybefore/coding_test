package backjoon;


import java.util.Scanner;

public class Q10250_ACM호텔 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String [] resArray = new String[T];//테스트케이스를 담을 배열
		
		for(int i=0;i<T;i++) {
			int hotelHeight = sc.nextInt();
			int hotelWidth = sc.nextInt();
			int N = sc.nextInt();
			
			int height = 0;
			int width = 1;
			int cnt = 0;

			height = N/hotelHeight;
			//System.out.println("N번째 손님이 묵을 방");
			//System.out.println("height : "+height);
			//System.out.println("width : "+width);
			String widthStr = "";
			if(width<10) widthStr = "0"+width;
			
			resArray[i] = height+widthStr;
		}
		
		for(int i=0;i<resArray.length;i++) {
			System.out.println(resArray[i]);
		}
		
		
		
	}
}
