package 기본수학2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q4948_베르트랑_공준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> inputList = new ArrayList<>();
		
		
		while(true) {
			int input = sc.nextInt();
			if(input == 0) break;
			inputList.add(input);
		}
		
		
		
		List<Integer> primeCntList = new ArrayList<>();
		
		//받은 input들을 돌기
		for(int i=0;i<inputList.size();i++) {
			int M = inputList.get(i);
			int N = 2 * M;
			int primeCnt = 0;
			
			//받은 input에 대한 소수 개수 세기 + primeCntList에 추가하기
			for(int j=M+1;j<=N;j++) {
				if(isPrime(j)) primeCnt++;
			}
			primeCntList.add(primeCnt);
		}
		
		for(int i=0;i<primeCntList.size();i++) {
			System.out.println(primeCntList.get(i));
		}
		
	}
	public static boolean isPrime(int Number) {
		if(Number == 1) return false;
		
		for(int i=2;i<=Math.sqrt(Number);i++) {
			if(Number%i == 0) return false;
		}
		return true;
	}

}
