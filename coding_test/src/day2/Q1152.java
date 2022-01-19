package day2;
//백준 단계별로 풀어보기 - 문자열 - 단어의 개수
import java.util.Scanner;

public class Q1152 {

	public static void main(String[] args) {
		/*
		 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
		 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
		 * 
		 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
		 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
		 * 
		 * ex1) [The Curious Case of Benjamin Button] => 6
		 * ex2) [ The first character is a blank] => 6
		 * ex3) [The last character is a blank ] => 6
		 * 
		 * */
		
		/*
		 * 예상 풀이 방법 : 문자가 나오면 isWord=true, isWord=true이면 word +=1;
		 * 				 이전에 문자가 나왔는데 다음에 또 문자가 나올 경우 isWord = false;, isWord=false;이면 추가하지 않음.
		 * 				 * 공백의 아스키코드값은 32이다.
		*/
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		
		int word = 0;
		char[] chArr = str.toCharArray();
		
		//맨앞이 space가 아니면 word = 1로 시작
		if((int)chArr[0] != 32) word =1;
		for(int i=0;i<chArr.length;i++) {
			//이전이 space였고 현재가 char일 때
			if((int)chArr[i] !=32  && i>0 && (int)chArr[i-1] == 32) {
//				System.out.println(chArr[i]);
				word += 1;
			}
		}
		System.out.println(word);
		

	}

}
