package lecture;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Test220610_실습 {
	
	public static void main(String[] args) {
		int q1[] = {4,7,32,43,22,19};
//		solution1(q1);
		
		String[] q2= {"tank", "kick", "know", "wheel", "land", "dread"};
//		System.out.println(solution2(q2));
		
		int q3[] = {1,1,3,3,0,1,1};
		solution3(q3);
		
	}
	//1. 로또 번호 검출기
	public static boolean solution1(int[] lotto) {
		/*
		 * 로또복권의 번호는 1에서 45 사이의 값을 가진 6개의 숫자로 구성됩니다.
		 * 로또복권을 신청하는 사용자들은 OMR카드에 숫자를 마킹하여 신청을 하는데, 가끔 잘못 표시하여 신청하는 사용자들이 있습니다.
		 * 로또복권에 등록 가능한 숫자조합인지 확인하는 기능을 작성해 주세요
		 * */
		boolean answer = true;
		Set<Integer> list = new HashSet<Integer>();
		for(int i=0;i<lotto.length;i++) {
			list.add(lotto[i]);
		}
		if(lotto.length != list.size()) answer = false;
		return answer;
	}
	//2. 끝말 잇기
	public static boolean solution2(String[] words) {
		boolean answer = true;
		Set<String> set = new HashSet<String>();
		for(int i=0;i<words.length;i++) {
			set.add(words[i]);
			if(i<words.length-1) {
				String lastChar = String.valueOf(words[i].charAt(words[i].length()-1));
				String firstChar = String.valueOf(words[i+1].charAt(0));
				if(!lastChar.equals(firstChar)) return false;
			}
			
			
			
		}
		if(set.size() != words.length) return false;
		return answer;
	}
	//3. 같은 숫자는 싫어
	public static int[] solution3(int[] arr) {
		int[] answer = {};
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) set.add(arr[i]);
		System.out.println(set);
		return answer;
	}
}
