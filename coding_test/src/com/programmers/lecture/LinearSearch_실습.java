package com.programmers.lecture;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinearSearch_실습 {

	public static void main(String[] args) {
//		String[] phone_book = {"119", "976744223", "1195524421"};
//		String[] phone_book = {"123","456","789"};
		String[] phone_book = {"12","123","1235","567","88"};
//		System.out.println(solution1(phone_book));
		
		//2. 문자열 내 p와 y의 개수
		String str = "pPoooyY";
//		String str = "Pyy";
//		System.out.println(solution2(str));
		
		String skill = "CBD";
		String[] skill_tress = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(solution3(skill, skill_tress));
	}
	public static boolean solution1(String[] phone_book) {
		//91.7점
//		//1. 길이순 정렬 하고 
//		Arrays.sort(phone_book, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length() - s2.length();
//			}
//		});
//		//2. 각 인덱스 i마다 i+1 ~ 끝까지에 i가 포함되어있는지 확인
//		for(int i=0;i<phone_book.length-1;i++) {
//			for(int j=i+1;j<phone_book.length;j++) {
//				if(phone_book[j].contains(phone_book[i])) {
//					if(checkPhone(phone_book[i], phone_book[j]))
//						return false;
//				}
//			}
//		}
//		
////		System.out.println(Arrays.toString(phone_book));
//		return true;
		//시작 숫자별 sort
		Arrays.sort(phone_book);
		//강사님
		for(int i=1;i<phone_book.length;i++) {
			if(phone_book[i].startsWith(phone_book[i-1])) return false;
		}
		return true;
	}

	public static boolean solution2(String s) {
		LinkedList<String> list = new LinkedList<String>();
		for(int i=0;i<s.length();i++) list.add(String.valueOf(s.charAt(i)));
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
//		System.out.println(list);
		int pSum = 0;
		int ySum = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).equals("P") || list.get(i).equals("p")) pSum++;
			if(list.get(i).equals("Y") || list.get(i).equals("y")) ySum++;
		} 
//		System.out.println("psum : "+pSum);
//		System.out.println("ysum : "+ySum);
		return pSum == ySum;
	}
	
	public static int solution3(String skill, String[] skill_trees) {
		int answer = 0;
		for(String s: skill_trees) {
			String s2 = s.replaceAll("[^"+skill+"]", "");
//			System.out.println(s2);
			if(skill.startsWith(s2)) answer++;
			
		}
		return answer;
	}
}
