package com.programmers.lecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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
		
		int priorities[] = {2, 1, 3, 2};
//		int priorities[] = {1, 1, 9, 1, 1, 1};
//		System.out.println(solution4(priorities, 2));
		
	}
	//1. 올바른 괄호
	public static boolean solution1(String s) {
		//맞는 코드이긴 함!
//		Queue<Character> que = new LinkedList<Character>();
//		for(int i=0;i<s.length();i++) {
//			que.offer(s.charAt(i));
//		}
//		int completion = 0;
//		for(int i=0;i<s.length();i++) {
//			if(completion < 0 ) return false;
//			if(que.poll()==')') completion -= 1;
//			else completion += 1;
//		}
//		if(completion == 0) return true;
//		return false;
		
		//강사님
//		int stack = 0;
		Stack<Character> stack = new Stack<Character>();
		for(char c: s.toCharArray()) {
			if(c == '(')
				stack.push(c);
//				stack++;
			else {
				if(stack.isEmpty()) return false;
				else stack.pop();
//				if(stack == 0) return false;
//				stack--;
			}
		}
		return stack.isEmpty() == true;
//		return stack == 0;
		
	}
	//2. 기능 개발
	public static int[] solution2(int[] progresses, int[] speeds) {
		//정답이긴 함!
//		List<Integer> num = new LinkedList<Integer>();
//		Queue<Integer> que = new LinkedList<Integer>();
//		Queue<Integer> spd = new LinkedList<Integer>();
//		//Queue에 넣기
//		for(int i=0;i<progresses.length;i++) que.offer(progresses[i]);
//		for(int i=0;i<speeds.length;i++) spd.offer(speeds[i]);
//		int day = 0;
//		//맨 앞이 비어있지 않으면 계속 돌기
//		while(que.peek() != null) {
//			int percent = que.peek() + (day)*spd.peek(); // 현재 맨 앞 프로그레스의 진행률
//			int cnt = 0;//몇개가 배포되는지 세는 변수
//			//현재 맨 앞의 프로그레스 진도율이 100이하일 경우 계속 돌아서 day를 계산해줌
//			while(percent < 100) {
//				percent += spd.peek();
//				day++;
//			}
//			//맨앞의 진행률 + (day * 맨앞의 speed) 가 100 이상이면
//			//한꺼번에 배포하기 위해 cnt++; 해주고 Queue에서도 빼줌
//			while(que.peek() != null) {
//				if(que.peek() + day*spd.peek() >= 100) {
//					cnt++; que.poll(); spd.poll();
//				}else break;
//			}
//			num.add(cnt);
//		}
//		
//		return num.stream().mapToInt(Integer::intValue).toArray();
		
		//강사님
		//[93, 30, 55], [1, 30, 5]
		//[7, 3, 9]
		//[(7이하인 작은애들 갯수), (7이상인 9 (1개)] => [2, 1]
		Queue<Integer> que = new LinkedList<Integer>();
		for(int i=0;i<progresses.length;i++) {
			double p = progresses[i];
			double s = speeds[i];
			int days =(int)Math.ceil((100 -progresses[i])/speeds[i]);
			que.offer(days);//que에 [7,3,9]가 들어감
		}
		
		//que : 일이 완료되는데 까지 걸리는 days : [7, 3, 9]
		int cnt = 1;//일단 무조건 1개는 배포할테니까 1로 시작
		Queue<Integer> answer = new LinkedList<Integer>();
		int tmp = que.poll(); //맨 첫번째꺼 poll() : [7]
		while(!que.isEmpty()) {//que가 빌 때 까지
			int n = que.poll();//poll() : [3]
			if(tmp >= n) {//첫번째 프로젝트 소요일 >= 비교할 프로젝트 소요일 
				cnt++;//배포 할 숫자 cnt
				continue;//반복문 맨앞으로 가기
			}
			//첫번째 프로젝트 소요일 < 비교할 프로젝트 소요일
			answer.offer(cnt);//배포할 숫자를 answer에 삽입
			cnt = 1;//배포 개수 초기화
			tmp = n;//비교할 소요일부터 시작해서 그 다음것들 비교
		}
		
		answer.offer(cnt);//마지막 그룹(배포 개수)를 answer에 삽입
		//[2,1]
		return answer.stream().mapToInt(Integer::intValue).toArray();
		
	}
	//3. 주식 가격
	public static int[] solution3(int[] prices) {
		//강사님 것 보고 하기....ㅠ
		int[] answer = new int[prices.length];
		for(int i=0;i<prices.length;i++) {
			int price = prices[i];
			int seconds = 0;
			for(int j=i+1;j<prices.length;j++) {
				seconds++;
				if(price >= prices[j]) break;;
			}
			answer[i] = seconds;
		}
		
		return answer;
	}
	//4. 프린터
	public static int solution4(int[] priorities, int location) {
		class Paper{
			boolean isMine;
			int priority;
			Paper(boolean m, int p){ this.priority = p; this.isMine = m;}
		}
		List<Paper> que = new LinkedList<Paper>();
		for(int i=0;i<priorities.length;i++) que.add(new Paper(i==location, priorities[i]));
		
		
		
		int answer = 0;
		while(!que.isEmpty()) {
			Paper now = que.remove(0);
			boolean printable = true;
			
			for(Paper p:que) {
				if(now.priority < p.priority) printable = false; break;
			}
			
			if(!printable) {
				que.add(now);
				continue;
			}
			answer++;
			
			if(now.isMine) return answer;
		} 
		
			
		
        
        return 1;
    }
}
