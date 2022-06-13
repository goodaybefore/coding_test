package com.programmers.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class StackAndQueue_실습 {

	public static void main(String[] args) {
		String s = "(()))(()(())";
		System.out.println(solution(s));
		
	}
	public static boolean solution(String s) {
		Queue<Character> que = new LinkedList<Character>();
		for(int i=0;i<s.length();i++) {
			que.offer(s.charAt(i));
		}
		int open = 0;
		int close = 0;
//		if(que.peek() == ')') return false;
		for(int i=0;i<que.size();i++) {		
			if(close>que.size()/2 || open>que.size()/2) return false;
			if(close > open) return false;
			else {
				if(close == open) {
					System.out.println(que);
					System.out.println("peek : "+que.peek());
					if(que.peek() == ')') return false;
				}
					
			}
			if(que.poll()==')') close++;
			if(que.poll()=='(') open++;
			
		}
		if(open == close) return true;
		return false;
	}
	
}
