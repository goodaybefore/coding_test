package day3;
//정답지 보고 Scanner로 바꿔쓴것.. 내가 한거랑 다를게 없어보이는데
//틀렸음.왜지?
import java.util.Scanner;

//백준 단계별로 풀어보기 - 문자열 - 크로아티아 알파벳
public class Q2941_FAIL2 {
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
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int res = 0;
		char charArr[] = str.toCharArray();
		int length = charArr.length;
		
		for(int i=0;i<length;i++) {
			res++;
			switch(charArr[i]) {
			case 'c':
				if(i<length-1 && (str.charAt(i+1)=='=' || str.charAt(i+1)=='-')) i++;
				break;
			case 'd':
				if(i<length-1 && str.charAt(i+1)=='-') i++;
				if(i<length-2 && str.charAt(i+1)=='z' && str.charAt(i+2)=='=') i+=2;
				break;
			case 'l':
			case 'n':
				if(i<length-1 && (str.charAt(i+1)=='j')) i++;
				break;
			case 's':
			case 'z':
				if(i<length-1 && (str.charAt(i+1)=='=')) i++;
				break;
			}
		}
		System.out.println(res);
		sc.close();
	}
	
}
	
