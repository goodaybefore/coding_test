package 문자열;

import java.util.Scanner;

//백준 단계별로 풀어보기 - 문자열 - 크로아티아 알파벳
public class Q2941_FAIL {
	/*
	 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다
	 *크로아티아 알파벳	변경
	 * č	c=
	 * ć	c-
	 * dž	dz=
	 * đ	d-
	 * lj	lj
	 * nj	nj
	 * š	s=
	 * ž	z=
	 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
	 * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다.
	 * 위 목록에 없는 알파벳은 한 글자씩 센다.
	 *
	 *
	 * 입력) 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
	 * 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
	 * 
	 * 출력) 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] chArr = str.toCharArray();
		int charCnt = 0;
		for(int i=0;i<chArr.length;i++) {
			switch(chArr[i]) {
			case 'c':
				if(i+1>chArr.length-1) { charCnt+=1; break; }//i+1이 배열의 크기보다 클때
				else if(chArr[i+1] == '=' || chArr[i+1] == '-') {//c=이나 c-인 경우
					charCnt +=1;
					i = i+1;//c- 혹은 c=가 차지한 배열숫자만큼 커서를 뒤로 보내줌(+1만 하는 이유는 어차피 반복문 돌면 +1되기 때문..)
					break;
				}
				//break;
			case 'd':
				if(i+2>chArr.length-2) {charCnt +=1; break;}//dz=가 반드시 아닌경우
				if(i+1>chArr.length-1) {charCnt+=1; break;}//d가 마지막인 경우
				else if(chArr[i+1] == 'z' && chArr[i+2] == '=') {//dz=인 경우
					charCnt += 1;
					i = i + 2;
					break;
				}else if(chArr[i+1]=='-') {//d-인 경우
					charCnt += 1; 
					i += 1;
					break; 
				}
				//break;//이거 주석 풀고 a~z까지 문자 세면 break;하나당 -1개됨... 왜 뺴줘야할까?
			case 'l':
				if(i+1>chArr.length-1) { charCnt+=1; break;}
				else if(chArr[i+1] == 'j') {
					charCnt +=1;
					i = i+1;
					break;
				}
			case 'n':
				if(i+1>chArr.length-1) { charCnt+=1; break;}
				else if(chArr[i+1] == 'j') {
					charCnt +=1;
					i = i+1;
					break;
				}
			case 's':
				if(i+1>chArr.length-1) { charCnt+=1; break;}
				else if(chArr[i+1] == '=') {
					charCnt +=1;
					i = i+1;
					break;
				}
			case 'z':
				if(i+1>chArr.length-1) { charCnt+=1; break;}
				else if(chArr[i+1] == '=') {
					charCnt +=1;
					i = i+1;
					break;
				}
			default:
				charCnt +=1;
			}
		}
		
		System.out.println(charCnt);
	}
	
}
