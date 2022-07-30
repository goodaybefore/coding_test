package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q10773_제로 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for(int i=0;i<N;i++) {
			int input = Integer.parseInt(br.readLine());
			if(input == 0) {
				sum -= stack.pop();
			}
			else {
				sum += input;
				stack.push(input);
			}
		}
		System.out.println(sum);
		
		

	}

}
