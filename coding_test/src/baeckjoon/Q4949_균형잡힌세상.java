package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q4949_균형잡힌세상 {
	static Stack<Character> stack1;
	static Stack<Character> stack2;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = " ";
		
		StringBuilder sb = new StringBuilder();
		//마지막 문자열이 . 을 포함할 때 까지 계속 받기
		while(true) {
			str = br.readLine();
			if(str.equals(".")) break;
			stack1 = new Stack<Character>();
			stack2 = new Stack<Character>();
			if(isCorrect(str)) sb.append("yes").append("\n");
			else sb.append("no").append("\n");
		}
		System.out.println(sb);
	}
	//boolean 판단보다 답지처럼 String으로 바로 yes, no 출력하는게 더 깔끔할듯!
	public static boolean isCorrect(String str) {
		for(char c : str.toCharArray()) {
			//여는 괄호일 경우 stack에 push
			if(c == '(' || c == '[') stack1.push(c);
			
			//닫는 소괄호
			else if(c == ')') {
				if(stack1.isEmpty() || stack1.peek() != '(') return false;
				else stack1.pop();
			}
			
			//닫는 대괄호
			else if(c == ']') {
				if(stack1.isEmpty() || stack1.peek() != '[') return false;
				else stack1.pop();
			}
		}
		if(stack1.isEmpty()) return true;
		else return false;
	}

}
