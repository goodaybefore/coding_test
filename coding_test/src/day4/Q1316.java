package day4;
import java.util.Arrays;
import java.util.Scanner;

/* 그룹단어 체커
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에 단어가 들어온다.
 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 * 
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 * 
 * */
public class Q1316 {

	public static void main(String[] args) {
		//알파벳
		boolean arr[] = new boolean[26];
		Scanner sc = new Scanner(System.in);
		
		//단어 몇개 주나요
		int a = sc.nextInt();
		
		//단어 수만큼 받아서 저장
		String[] strArr = new String[a];
 		for(int i=0;i<strArr.length;i++) {
			strArr[i] = sc.next();
		}
		
 		int groupWord = 0;
 		for(String tmp : strArr) {
 			if(IsGroupWord(tmp, arr)) {
 				groupWord++;
 			}
 			//한번 돌았으니 다시 false로 가득 채워주기
 			Arrays.fill(arr, false);
// 			System.out.println();
 		}
 		System.out.println(groupWord);
	}
	
	public static boolean IsGroupWord(String str, boolean arr[]) {
		//단어를 문자 하나하나로 쪼갬
		char tmpArr[] = str.toCharArray();
		
		for(int i=0;i<tmpArr.length;i++) {
			int acNum = (int)tmpArr[i] - 97;
//			System.out.print(acNum+" ");
			//나 0번째 아니지?
			if(i==0) {
				arr[acNum] = true;
			}else {
				//내 앞에 있는게 나랑 달라?
				if(tmpArr[i-1] != tmpArr[i]) {
					//arr에서 내글자 true야?
					if(arr[acNum] == true) return false;
					else arr[acNum] = true;
				}
			}
		}
		return true;
	}

}
