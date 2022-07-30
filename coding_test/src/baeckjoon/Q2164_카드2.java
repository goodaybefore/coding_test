package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164_카드2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> que = new LinkedList<Integer>();
		
		for(int i=1;i<=N;i++) que.add(i);
		
		int frontCard = 0;
		while(que.peek() != null) {
			//맨 윗장 버리기
			frontCard = que.poll();
//			System.out.println(que);
			//맨 윗장을 맨 뒤로
			que.add(que.poll());
		}
		System.out.println(frontCard);
		
	}

}
