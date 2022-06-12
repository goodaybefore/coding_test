package com.programmers.lecture;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Set_강의 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//중복 추가를 없애기위해
		if(!list.contains(1)) list.add(1);
		if(!list.contains(2)) list.add(2);
		if(!list.contains(3)) list.add(3);
		
//		System.out.println("list : "+list);
		
		HashSet<Integer> list2 = new HashSet<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(1);
		list2.add(2);
		list2.add(3);
//		System.out.println("list2 : "+list2);
		
		
		//MyData에 hashCode()가 없으면 123213이런식으로 나옴
		HashSet<MyData> list3 = new HashSet<MyData>();
		list3.add(new MyData(1));
		list3.add(new MyData(2));
		list3.add(new MyData(3));
		
		list3.add(new MyData(1));
		list3.add(new MyData(2));
		list3.add(new MyData(3));
		
//		System.out.println("list3 : "+list3);
		
		//간단 예제 : 합집합
		Set<MyData> setA = new LinkedHashSet<MyData>();
		Set<MyData> setB = new LinkedHashSet<MyData>();
		//A
		setA.add(new MyData(1));
		setA.add(new MyData(2));
		setA.add(new MyData(3));
		
		//B
		setB.add(new MyData(2));
		setB.add(new MyData(4));
		setB.add(new MyData(3));
		
		//A+B
//		setA.addAll(setB);
//		System.out.println("A+B : "+setA);
		//A-B
//		setA.removeAll(setB);
//		System.out.println("A-B : "+setA);
		//A*B
		setA.retainAll(setB);
		System.out.println(setA);
		
	}

}
