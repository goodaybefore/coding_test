//package com.programmers.lecture;
//
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Random;
//
//// search는 indexOf, contains, remove같은 곳에서 이미 구현되어 있음 : 완전탐색
//// equals가 제공될 필요
//
//// 이진탐색(BinarySearch) : Collections.binarySearch
//// 탐색의 대상이 되는 객체는 Comparable 인터페이스가 implements 되어 있어야 함
//// + 순서대로 정렬이 되어있어야 함
//
//class MyData implements Comparable<MyData>{
//	int v;
//	public MyData(int v) {
//		this.v = v;
//	}
//	@Override
//	public String toString() {
//		return ""+v;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + v;
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		MyData other = (MyData) obj;
//		if (v != other.v)
//			return false;
//		return true;
//	}
//	
//	//Comparable을 implements 하고 이거를 써줘야함..
//	//왜냐하면 Comparable 인터페이스에 compareTo가 있기 때문
//	//내꺼 - 남의꺼 해서 남의꺼가 더 크면 음수(-), 같으면 0, 남의꺼가 더 작으면 (+);
//	@Override
//	public int compareTo(MyData o) {
//		//1 == 1 : 1-1=0 인지를 확인하고 1 == 1을 인식함
//		//1 ? 2 : 1 - 2 == 0, 0과 같으면 같다, -이면 2가 크다, +이면 1이 크다
//		
//		//내꺼 : v, 남의꺼 데이터 : o.v
//		return v - o.v;
//	}
//	
//	
//}
//public class LinearSearch_강의 {
//
//	public static void main(String[] args) {
//		List<Integer> list = new LinkedList<Integer>();
//		for(int i=1;i<=100;i++) list.add(i);
//		
//		System.out.println();
//		System.out.println(list);
//		//리스트에서 integer 위치 찾기
//		//1. indexOf(값) 사용
//		System.out.println(list.indexOf(63));
//		
//		
//		//리스트에서 객체(Object) 위치 찾기
//		List<MyData> list2 = new LinkedList<MyData>();
//		for(int i=1;i<=100;i++) list2.add(new MyData(i));
//		System.out.println();
//		
//		System.out.println(list2);
//		int idx = list2.indexOf(63);
//		System.out.println(idx);//결과 : -1
//		idx = list2.indexOf(new MyData(63));
//		System.out.println(idx);//new Mydata로 찾기 + equals 오버라이드 = 결과 : 63
//		
//		
//		//랜덤
//		
//		Random r = new Random();
//		List<MyData> list3 = new LinkedList<MyData>();
////		for(int i=1;i<=100;i++) list3.add(new MyData(r.nextInt(100))); //랜덤일때
//		for(int i=1;i<=100;i++) list3.add(new MyData(i));//바이너리 쓸때
//		System.out.println(list3);
//		
//		int idx3 = list3.indexOf(new MyData(63));
//		System.out.println(idx3);
//		
//		
//		//binarySearch의 return 값은 index를 Integer타입으로 리턴
//		//단, 서치 방식의 특성상 정렬이 되어있어야 함
//		idx = Collections.binarySearch(list3, new MyData(63));
//		System.out.println(idx3);//마이너스가 나옴...
//		System.out.println(list3.get(idx3));
//	}
//
//}
