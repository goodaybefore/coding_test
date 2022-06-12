package com.programmers.lecture;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
public class StackAndQueue_강의 {

	public static void main(String[] args) {
		//List로 Stack과 Queue 구현
//		Test1();
		
		//Java에서 제공하는 Stack과 Queue
//		testQueue();
//		testStack();
		testDeque();
		
	}
	public static void Test1() {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//1. Queue 적용
		System.out.println("Queue");
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println();
		
		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		System.out.println("Stack");
		System.out.println(list2);
		System.out.println(list2.remove(list2.size()-1));
		System.out.println(list2);
		System.out.println(list2.remove(list2.size()-1));
		System.out.println(list2);
		System.out.println(list2.remove(list2.size()-1));
		System.out.println(list2);
	}
	public static void testQueue() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(1);
		queue.offer(2);	
		queue.offer(3);	
		queue.offer(4);	
		queue.offer(5);	
		
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
	}
	public static void testStack() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack);
		
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
	}
	public static void testDeque() {
		Deque<Integer> deque =  new LinkedList<Integer>();
		deque.offerFirst(1);
		System.out.println(deque);
		deque.offerLast(2);
		System.out.println(deque);
		deque.offerFirst(3);
		System.out.println(deque);
		deque.offerLast(4);
		System.out.println(deque);
		
		deque.pollFirst();
		System.out.println(deque);
		deque.pollFirst();
		System.out.println(deque);
	}
	
	
}
