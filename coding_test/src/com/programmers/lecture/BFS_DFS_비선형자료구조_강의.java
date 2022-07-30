package com.programmers.lecture;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


//Node는 다른 node들과 연결 가능 + 방문 여부 확인 가능
//equals 사용
//BFS : Queue / DFS : Stack
//연결되어있는 노드들을 예약목록에 넣어놓기(이미 방문하거나 이미 등록된건 넣지 않음)

class Node{
	String name;
	List<Node> links;
	//방문여부기록
	boolean visited;
	
	public Node(String name) {
		this.name = name;
		this.links = new LinkedList<>();
	}
	
	void link(Node node) {
		links.add(node);
	}
	
	void visit() {//방문여부기록
		this.visited = true;
	}
	boolean isVisited() {
		return this.visited;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Node other = (Node) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
public class BFS_DFS_비선형자료구조_강의 {
	//Graph : Node, Edge로 구성됨
	static Node a = new Node("A");
	static Node b = new Node("B");
	static Node c = new Node("C");
	static Node d = new Node("D");
	static Node e = new Node("E");
	
	public static void main(String[] args) {
		
		//Node 사이의 연결 해주기
		a.link(b);
		a.link(d);
		b.link(a);
		b.link(c);
		b.link(e);
		c.link(b);
		c.link(d);
		d.link(a);
		d.link(c);
		d.link(e);
		e.link(b);
		e.link(d);
		
		//BFS로 e 찾기 : Queue 사용
//		System.out.println("BFS");
//		BFS();
//		System.out.println();
		
		
		//DFS로 e 찾기 : Stack 사용
		System.out.println("DFS");
		DFS();
		System.out.println();
		
	}
	public static void BFS() {
		Node target = e;
		Queue<Node> que = new LinkedList<>();
		que.offer(a);//시작점 삽입
		
		while(!que.isEmpty()) {
			//Node를 꺼내서
			Node n = que.poll();
			//방문했다는 표시
			n.visit();
			System.out.println(n);
			if(n.equals(target)) {
				System.out.println("FOUND! => "+n);
				break;
			}
			
			//이 밑의 모든 것들이 다 같은 동작을 함
//			n.links.forEach(que::offer);
//			n.links.forEach(l -> que.offer(l));이 두개가 같음..먼뜻일까
			//이 Node가 que에 있는지 확인해보고 없으면 que에 넣음
			n.links.stream().filter(l -> !que.contains(l) && !l.visited).forEach(que::offer);
			//이미 방문했고, que에 쌓여있지 않은 것을 offer해서 예약시키기
//			for(Node l : n.links) {
//				if(l.isVisited()) continue;
//				if(que.contains(l)) continue;
//				que.offer(l);
//			}
				
			
		}
	}
	public static void DFS() {
		Node target = e;
		Stack<Node> stack = new Stack<>();
		stack.push(a);//시작점 삽입
		
		while(!stack.isEmpty()) {
			//Node를 꺼내서
			Node n = stack.pop();
			//방문했다는 표시
			n.visit();
			System.out.println(n);
			if(n.equals(target)) {
				System.out.println("FOUND! => "+n);
				break;
			}
			
			//이 밑의 모든 것들이 다 같은 동작을 함
//			n.links.forEach(que::offer);
//			n.links.forEach(l -> que.offer(l));이 두개가 같음..먼뜻일까
			
			//이 Node가 que에 있는지 확인해보고 없으면 que에 넣음
//			n.links.stream().filter(l -> !que.contains(l) && !l.visited).forEach(que::offer);
			
			//이미 방문했고, que에 쌓여있지 않은 것을 offer해서 예약시키기
			for(Node l : n.links) {
				if(l.isVisited()) continue;
				if(stack.contains(l)) continue;
				stack.push(l);
			}
				
			
		}
	}
}