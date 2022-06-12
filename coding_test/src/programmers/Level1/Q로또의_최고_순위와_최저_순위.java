package programmers.Level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Q로또의_최고_순위와_최저_순위 {
	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		List<Integer> lotto = new LinkedList<Integer>();
		List<Integer> wins = new LinkedList<Integer>();
		
		for(int i=0;i<lottos.length;i++) {
			lotto.add(lottos[i]);
			wins.add(win_nums[i]);
		}
		
		int worst = lottoRank(lotto, wins);//최악의 값
		int zeroCnt = Collections.frequency(lotto, 0);
		int cnt = 0;
		for(int i=0;i<wins.size();i++) {
			if(cnt == zeroCnt) break;
			if(!lotto.contains(wins.get(i))){ 
				lotto.add(wins.get(i));
				cnt++;
			}
		}
		int best = lottoRank(lotto, wins);
		return new int[] {best, worst};
	}
	public static int lottoRank(List<Integer> lotto, List<Integer> wins) {
		int correct = 0;
		for(int i=0;i<lotto.size();i++) {
			if(wins.contains(lotto.get(i))) {
				correct++;
			}
		}
		switch(correct) {
			case 6 : return 1;
			case 5 : return 2;
			case 4 : return 3;
			case 3 : return 4;
			case 2 : return 5;
			default : return 6;
		}
	}

}
