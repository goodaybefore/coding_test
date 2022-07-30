package com.programmers.lecture;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//Node는 다른 node들과 연결 가능 + 방문 여부 확인 가능
//equals 사용
//BFS : Queue / DFS : Stack
//연결되어있는 노드들을 예약목록에 넣어놓기(이미 방문하거나 이미 등록된건 넣지 않음)

class Word{
	String word;
	int depth;
	Word(String w, int d){ word = w; depth = d;}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	
}
public class BFS_DFS_비선형자료구조_실습 {
	static boolean visited[];
	public static void main(String[] args) {
		int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
		int n = 3;
//		System.out.println(solution1(n, computers));
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
//		System.out.println(solution2(numbers, target));
		
		
		String words[] = {"hot", "dot", "dog", "lot", "log", "cog"};
		String begin = "hit";
		String targetW = "cog";
//		System.out.println(solution3(begin, targetW, words));
		
		
		int maps[][] = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		System.out.println(solution4(maps));
		
	}
	public static int solution1(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(visited[i]) continue;
			answer++;
			//네트워크 하나 생겼고, 나머지 다 방문하면서 색칠해!
			visitAllConnectedComputers(computers, visited, i);
		}
		return answer;
	}
	//final : 여기 있는 값은 건드리지 마세용
	//몇번째 컴퓨터를 기준으로 방문하고 있는지 => c
	public static void visitAllConnectedComputers(final int[][] computers, boolean[] visited, int c) {
		//DFS 바꾸려면 que를 stack으로만 바꿔주면 됨
		Queue<Integer> que = new LinkedList<>();
		que.offer(c);//c 컴퓨터를 기준으로 시작하기 때문
		
		while(!que.isEmpty()) {
			int n = que.poll();
			visited[n] = true;
			//n번째 컴퓨터의 연결상태를 보기 때문에
			for(int i=0;i<computers[n].length;i++){
				System.out.println("computers["+n+"] : "+Arrays.toString(computers[n]));
				if(visited[i]) continue;
				if(computers[n][i] == 1) que.offer(i);
			}
		}
		
		
		
		
	}
	
	public static int solution2(int[] numbers, int target) {
		//numbers가 있고, 0번째 숫자를 이용해서 target을 만들어봐.. 
		return sumCnt(numbers, target, 0, 0);
	}
	public static int sumCnt(final int[] numbers, final int target, int i, int sum) {
		if(i == numbers.length) {
			if(sum == target) return 1;
			else return 0; 
		}
		return sumCnt(numbers, target, i+1, sum + numbers[i]) + sumCnt(numbers, target, i+1, sum - numbers[i]);
	}
	
	public static int solution3(String begin, String target, String[] words) {
		//target이 words 안에 없다면 바로 0 return;
		if(!Arrays.asList(words).contains(target)) return 0;
		int step = words.length;//최댓값을 미리 가정
		Set<String> used = new HashSet<>();
		Stack<Word> stack = new Stack<Word>();
		stack.add(new Word(begin, 0));
		
		while(!stack.isEmpty()) {
			Word now = stack.pop(); 
			//꺼낸게 equals 와 같으면 바로 now의 깊이 return
			if(now.word.equals(target)) return now.depth;
			
			
			for(String w:words) {
				//똑같거나 2개 이상 다른 알파벳이 섞여있으면 다음단어로 넘어감
				if(!changable(now.word, w)) continue;
				//set에 단어가 이미 들어가 있으면 다음 단어로 넘어감
				if(used.contains(w)) continue;
				
				//stack에 단어와, 단어의 depth 저장(now보다 한단계 더 올라가야함)
				stack.push(new Word(w, now.depth+1));
				used.add(w);
				
				
				//now에서 바꿀 수 있는(한 글자만 다른) 단어 + 사용하지 않은 단어 만 stack에 넣기
				//한 글자만 다른 단어
				//사용하지 않은 단어
			}
		}
		return step;
	}
	static boolean changable(String w1, String w2) {
		//글자 수가 다를 수 있으니 둘 중 짧은 숫자로
		int len = Math.min(w1.length(), w2.length());
		int cnt = 0;
		
		//글자가 2개 이상 다르면 바로 return으로 넘어가서 검사받음(1개가 아니니 false 리턴)
		for(int i=0;i<len && cnt<2 ;i++) {
			//w1의 i번째와 w2의 i번째랑 비교하고, 둘이 다르면 cnt++;
			if(w1.charAt(i) != w2.charAt(i)) cnt++;
		}
		//cnt가 1인 경우에만 true 반환
		return cnt == 1;
	}
	
	
//	public static int solution4(int[][] maps) {
//		//BFS
//		final int mapSizeX = maps.length;
//		final int mapSizeY = maps[0].length;
//		final Location target = new Location(mapSizeX - 1, mapSizeY - 1);
//		
//		boolean[][] visit = new boolean[mapSizeX][mapSizeY];
//		 
//		Queue<Position> que = new LinkedList<>();
//		
//		que.add(new Position(new Location(0, 0), 1));
//		
//		while(!que.isEmpty()) {
//			Position now = que.poll();
//			
//			//맵 밖
//			if(now.location.x < 0 ) continue;
//			if(now.location.x >= mapSizeX ) continue;
//			if(now.location.y < 0 ) continue;
//			if(now.location.y >= mapSizeY ) continue;
//			//벽
//			if(maps[now.location.x][now.location.y] == 0) continue;
//			//이미방문
//			if(visit[now.location.x][now.location.y])continue;
//			
//			visit[now.location.x][now.location.y] = true;
//			
//			//target에 도착했으면 now의 단계 리턴
//			if(now.location.equals(target)) return now.steps;
//			
//			//다음 방문
//			now.steps += 1;
//			que.offer(new Position(now.location.left(), now.steps + 1));
//			que.offer(new Position(now.location.right(), now.steps + 1));
//			que.offer(new Position(now.location.up(), now.steps + 1));
//			que.offer(new Position(now.location.down(), now.steps + 1));
//		}
//		return -1;
//    }
	
	
	
	
	
	public static int solution4(int[][] maps) {
		
		Queue<Object> que = new LinkedList<Object>();
//		que.add(시작위치);
		
		while(!que.isEmpty()) {
			Object now = que.poll();
		}
		return 1;
	}
}

class Position{
	int steps;
	Object 위치;
}














//class Location{
//	int x, y;
//	Location(int x, int y){this.x = x; this.y = y;}
//	
//	public boolean equals(Location other) {
//		return (this.x == other.x) && (this.y == other.y);
//	}
//	Location left() { return new Location(x - 1, y);	}
//	Location right() { return new Location(x + 1, y);	}
//	Location up() { return new Location(x, y - 1);	}
//	Location down() { return new Location(x, y - 1);	}
//}
//class Position{
//	int steps;
//	Location location;
//	public Position(Location l, int s) {location = l; steps = s;}
//	
//}
