package com.programmers.lecture;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Set_실습 {
	
	public static void main(String[] args) {
		int q1[] = {4,7,32,43,22,19};
//		solution1(q1);
		
		String[] q2= {"tank", "kick", "know", "wheel", "land", "dread"};
//		System.out.println(solution2(q2));
		
		int q3[] = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution3(q3)));
		
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
		return lotto.length != list.size();
	}
	//2. 끝말 잇기
	public static boolean solution2(String[] words) {
		boolean answer = true;
		Set<String> set = new HashSet<String>();
		set.add(words[0]);
		char last = words[0].charAt(words[0].length()-1);
		for(int i=1;i<words.length;i++) {
			String w = words[i];
			char first = w.charAt(0);
			
			if(last != first) return false;
			//set.add(문자)가 실패하면(=중복으로 들어가면) return false;
			//
			if(!set.add(words[i])) return false;
			last = w.charAt(w.length()-1);
		}
		return answer;
	}
	//3. 같은 숫자는 싫어
	public static int[] solution3(int[] arr) {
		//set의 동작원리를 사용해서 푸는 문제
		List<Integer> list = new LinkedList<Integer>();
		int last = -1;
		for(int a : arr) {
			if(last == a) continue;
			last = a;
			list.add(a);
		}
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}
