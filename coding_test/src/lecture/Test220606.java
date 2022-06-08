package lecture;

import java.util.HashMap;
import java.util.Map;

public class Test220606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 포켓몬
		int nums[] = {3,3,3,2,2,2};
		solution1(nums);
		
		//2. 완주하지 못한 선수
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		solution2(participant, completion);
		
		//3. 위장
		String[][] clothes = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"green_turban", "headgear"}
				};
//		solution3(clothes);
		
		
		
	}
	//1. 포켓몬
	public static int solution1(int[] nums) {
		int answer = 0;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<nums.length;i++) {
			
			if(map.get(nums[i])==null) {
				map.put(nums[i], 1);
				answer++;
			}
			if(answer == nums.length/2) break;
		}
		return answer;
	}
	//2. 완주하지 못한 선수
	public static String solution2(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		//map에 참가자 목록 넣기
		for(int i=0;i<participant.length;i++) {
			String name = participant[i]; 
			if(map.get(name) == null) map.put(participant[i], 1);
			else {
				map.replace(name, map.get(name)+1);
			}
		}
		//map에 완주자 이름 제거하기(동명이인의 경우 1명이 남을 때 까지 -1) 
		for(int i=0;i<completion.length;i++) {
			String name = completion[i];
			if(map.get(name) > 1) map.replace(name, map.get(name)-1);
			else if(map.get(name) == 1) map.remove(name);
		}
		
		//map 전체를 참자가이름목록으로 돌면서 null이 아닌 값을 출력하기
		for(int i=0;i<participant.length;i++) {
			String name = participant[i];
			if(map.get(name)!=null) {
				answer = name; break;
			}
		}
		System.out.println(answer);
		return answer;
	}
	//3. 위장
	public static int solution3(String[][] clothes) {
		int answer = 0;
//		System.out.println("clothes[0].length : "+clothes[0].length);
		Map<String, Integer> map = new HashMap<String, Integer>();
		//map에 옷 종류별 개수 저장
		for(int i=0;i<clothes.length;i++) {
			//해당 열의 맨 마지막에 옷의 종류가 나옴
			String name = clothes[i][clothes[i].length-1];
			//현재 name에 있는 옷의 개수
			int clothes_cnt = clothes[i].length-1;
			if(map.get(name) != null) map.put(name, map.get(name) + clothes_cnt);
			else map.put(name, clothes_cnt);
		}
//		System.out.println("map : "+map);
		int res = 1;
		for(int i=0;i<clothes.length;i++) {
			String name = clothes[i][clothes[i].length-1];
			if(map.get(name) != null){
//				System.out.println("res : "+res+", "+name+"의 개수 : "+(map.get(name)+1));
				res *= (map.get(name) + 1);
				map.remove(name);
				
			}
			
			
		}
		answer = res - 1;
		return answer;
	}
}
