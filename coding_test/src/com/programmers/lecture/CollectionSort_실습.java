package com.programmers.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class CollectionSort_실습 {

	public static void main(String[] args) {
//		int[] arr = {4,3,2,1};
		int[] arr = {10};
//		System.out.println(Arrays.toString(solution1(arr)));
		
//		String[] strings = {"sun", "bed", "car"};
		String[] strings= {"abce", "abcd", "cdx"};
//		System.out.println(Arrays.toString(solution2(strings, 2)));
		
		String s = "3people unFollowed me";
//		System.out.println(solution3(s));
		
		int[] citations = {3, 0, 6, 1, 5};
		System.out.println(solution4(citations));
	}
	public static int[] solution1(int[] arr) {
		int[] answer = new int[arr.length-1];
		List<Integer> ans = new ArrayList<Integer>();
		if(arr.length == 1) return new int[] {-1};
		
		int midx = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
				midx = i;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i == midx) continue;
			ans.add(arr[i]);
		}
//		System.out.println(ans);
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
	public static String[] solution2(String[] strings, int n) {
		
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.charAt(n) > o2.charAt(n)) return 1;
				else if(o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
				else return -1;
			}
			
		});
        return strings;
	}
	public static String solution3(String s) {
		//점수 : 44/100
//		String[] words = s.split(" ");
//		for(int i=0;i<words.length;i++) {
//			words[i] = words[i].toLowerCase();
//			char[] arr = words[i].toCharArray();
//			arr[0] = Character.toUpperCase(arr[0]);
//			words[i] = new String(arr);
//		}
//		s = String.join(" ", words);
//		return s;
		StringBuilder sb = new StringBuilder();
		String s2 = s.toLowerCase();
		char last = ' ';
		for(char c : s2.toCharArray()) {
			if(last == ' ') c = Character.toUpperCase(c);
			sb.append(c);
			last = c;
		}
		return sb.toString();
	}
	public static int solution4(int[] citations) {
		// [3, 0, 6, 1, 5]
		// 3회 이상 인용된게 전체 중 몇개인가? 0회이상 인용된게 전체중 몇개인가? ... 루프? => O(n^2) : 회피해보자
		//sort => [0,1,3,5,6] : 0회이상 인용된건 5개, 1회이상 인용된건 4개, 3회이상이 3개, 6회이상 인용된게 0회
		// length - 현재 index 하면 몇회 인용되었는지 확인 가능
		Arrays.sort(citations);
		
		for(int i=0;i<citations.length;i++) {
			int h = citations.length - i;
			if(citations[i] >= h) return h;
			}
		return -1;
	}
	
	
}
