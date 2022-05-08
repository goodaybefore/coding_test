package 기본수학2;

import java.util.Scanner;

public class Q1002_터렛 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		int res = 0;
		//1. 두 원의 중심이 같고, 반지름도 같을 때 ( 해가 무한 )
		if(x1 == x2 && y1 == y2 && r1 == r2) res = -1;
			
		//2. 중심이 같고 반지름이 다를 때 OR 두 점 사이의 거리가 두 반지름의 합보다 큰 경우 ( 해가 없음 )
		double distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
		System.out.println("두 점 사이의 거리 : "+distance);
		if( (x1 == x2 && y1 == y2 && r1 != r2) || (distance > r1+r2) ) res = 0;
		
		//3. 두 반지름의 차 = 두 점 사이의 [내접] 거리 OR 두 반지름의 합 = 두 점 사이의 거리 [외접] ( 해가 하나 )
		if(Math.abs(r1-r2) == distance || r1+r2 == distance) res = 1;
		
	}

}
