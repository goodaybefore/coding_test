package 기본수학2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q4153_직각삼각형 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<String> judge = new ArrayList<String>();
		
		while(true) {
			int triangle[] = {sc.nextInt(), sc.nextInt(), sc.nextInt() };
			if(triangle[0] == 0) break;
			//삼각형인지 아닌지 판단하는 함수
			if(isRightTriangle(triangle)) judge.add("right");
			else judge.add("wrong");
			
		}
		for(int i=0;i<judge.size();i++) {
			System.out.println(judge.get(i));
		}
	}
	public static boolean isRightTriangle(int arr[]) {
		int max = 0;
		int maxNum = 0;
		
		//각 변을 제곱시키기
		for(int i=0;i<arr.length;i++)
			arr[i] = arr[i] * arr[i];
		
		//System.out.println(Arrays.toString(arr));
		int longSide = 0;
		int shortSide1 = 0;
		int shortSide2 = 0;
		//긴 변 찾기
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				longSide = arr[i];
				maxNum = i;
			}
		}
		
		
		//직각삼각형 판별하기
		if(maxNum == 0) {
			shortSide1 = arr[1];
			shortSide2 = arr[2];
		}else if(maxNum == 1) {
			shortSide1 = arr[0];
			shortSide2 = arr[2];
		}else {
			shortSide1 = arr[0];
			shortSide2 = arr[1];
		}
//		System.out.println("long : "+longSide);
//		System.out.println("shortSide1 : "+shortSide1);
//		System.out.println("shortSide2 : "+shortSide2);
		if(longSide == shortSide1 + shortSide2) return true;
		else return false;
	}
}

