package com.programmers.lecture;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class StackAndQueue_실습 {

	public static void main(String[] args) {
//		String s = "(()))(()(())";
		String s = "()()";
//		System.out.println(solution1(s));
		
		int[] progress = {93, 30, 55};
		int[] speeds = {1, 30, 5};
//		System.out.println(Arrays.toString(solution2(progress, speeds)));
		
		int prices[] = {1,2,3,2,3};
//		System.out.println(solution3(prices));
		
//		int priorities[] = {2, 1, 3, 2};
		int priorities[] = {1, 1, 9, 1, 1, 1};
		System.out.println(solution4(priorities, 0));
		
	}
	//1. 올바른 괄호
	public static boolean solution1(String s) {
		Queue<Character> que = new LinkedList<Character>();
		for(int i=0;i<s.length();i++) {
			que.offer(s.charAt(i));
		}
		int completion = 0;
//		if(que.peek() == ')') return false;
		for(int i=0;i<s.length();i++) {
			if(completion < 0 ) return false;
			if(que.poll()==')') completion -= 1;
			else completion += 1;
		}
//		System.out.println("completion : "+completion);
		if(completion == 0) return true;
		return false;
	}
	//2. 기능 개발
	public static int[] solution2(int[] progresses, int[] speeds) {
		List<Integer> num = new LinkedList<Integer>();
		Queue<Integer> que = new LinkedList<Integer>();
		Queue<Integer> spd = new LinkedList<Integer>();
		//Queue에 넣기
		for(int i=0;i<progresses.length;i++) que.offer(progresses[i]);
		for(int i=0;i<speeds.length;i++) spd.offer(speeds[i]);
		
		
		int day = 0;
		//맨 앞이 비어있지 않으면 계속 돌기
		while(que.peek() != null) {
			int percent = que.peek() + (day)*spd.peek(); // 현재 맨 앞 프로그레스의 진행률
			int cnt = 0;//몇개가 배포되는지 세는 변수
			//현재 맨 앞의 프로그레스 진도율이 100이하일 경우 계속 돌아서 day를 계산해줌
			while(percent < 100) {
				percent += spd.peek();
				day++;
			}
			//맨앞의 진행률 + (day * 맨앞의 speed) 가 100 이상이면
			//한꺼번에 배포하기 위해 cnt++; 해주고 Queue에서도 빼줌
			while(que.peek() != null) {
				if(que.peek() + day*spd.peek() >= 100) {
					cnt++; que.poll(); spd.poll();
				}else break;
			}
			num.add(cnt);
		}
		
		return num.stream().mapToInt(Integer::intValue).toArray();
	}
	//3. 주식 가격
	public static int[] solution3(int[] prices) {
		//강사님 것 보고 하기....ㅠ
		List<Integer> list = new LinkedList<Integer>();
		
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
	//4. 프린터
	public static int solution4(int[] priorities, int location) {
        Deque<Integer> dq = new LinkedList<Integer>();
        for(int i=0;i<priorities.length;i++) dq.offerLast(priorities[i]);
        
        
        while(dq.size()!=0) {
        	boolean retry = false;
        	int tmp = dq.pollFirst();//큐의 첫번째 데이터
    		System.out.println("시작 : "+dq);
    		System.out.println("*location : "+location);
        	for(int i=0;i<dq.size()+1;i++) {
        		System.out.println("priorities[i] : "+priorities[i]+", tmp : "+tmp);
        		
        		if(priorities[i] > tmp) {
        			dq.offerLast(tmp);
        			location = location==0 ? dq.size() : --location;
        			retry = true;
        			break;
        		}
        	}
        	if(!retry && location != 0) {
        		dq.pollFirst();
        		location = location==0 ? dq.size() : --location;
        	}
        	System.out.println("for문 끝난후 dq : "+dq);
        	
        }
        System.out.println("p.length : "+priorities.length+", dq.size() : "+(dq.size()));
        System.out.println();
        return priorities.length - (dq.size());
    }
}
