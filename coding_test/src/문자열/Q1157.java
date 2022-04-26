package 문자열;

import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		/*
		 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
		 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
		 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 * ex) input : Mississipi / output : ?
		 * ex) input : Zza / output : Z
		 * */
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
//		String str = "eMma";
//		System.out.println(str);
		
		
		//풀이법 : 글자 하나하나의 아스키코드를 따져서 카운팅하기
		
		//받은 문자열을 한글자씩 잘게 부숨
		char[] chArr = str.toCharArray();
		
		int num = 0;
		int count[] = new int[26];//영문숫자 개수 26개
		for(int i=0;i<chArr.length;i++) {//length가 맞을까 size가 맞을까?
			if((int)(chArr[i])>122 || (int)(chArr[i])<65) return;
			if((int)(chArr[i])<97 && (int)(chArr[i])>=65) {
				num = (int)(chArr[i]) + 32;//아스키코드 몇번인지
			}else if((int)(chArr[i])>=97 && (int)(chArr[i])<=122) {
				num = (int)(chArr[i]);//아스키코드 몇번인지 알아내기
			}
			count[num - 97] += 1;
		}
		
		int maxAl = 0;
		int max = 0;
		int maxCnt = 0;
		for(int i=0;i<count.length;i++) {
			if(max<count[i]) {
				max = count[i];
				maxAl = i;
				maxCnt = 1;
			}else if(max==count[i]) {
				maxCnt+=1;
			}
		}
		if(maxCnt>1) System.out.println("?");
		else System.out.println((char)(maxAl+65));
	}

}
