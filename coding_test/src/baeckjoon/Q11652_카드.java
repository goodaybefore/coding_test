package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Q11652_카드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		
		int max = 0;
		long x = 0;
		for(int i=0;i<N;i++) {
			Long card = Long.parseLong(br.readLine());
			if(map.get(card) == null) map.put(card, 1);
			else map.replace(card, map.get(card)+1);
			//map.put(card, map.getOrDefault(card, 0)+1); //로 대체가능
			
			if(map.get(card) > max) {
				max = map.get(card);
				x = card;
			}else if(map.get(card) == max) {
				x = Math.min(x, card);
			}
		}
		System.out.println(x);
	}

}
