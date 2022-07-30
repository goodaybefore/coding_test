//package com.programmers.lecture;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Vector;
//
//class MyData{
//	int value;
//	public MyData(int value) {
//		this.value = value;
//	}
//	static MyData create(int v) {
//		return new MyData(v);
//	}
//	@Override
//	public String toString() {
//		return ""+value;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + value;
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
//		if (value != other.value)
//			return false;
//		return true;
//	}
//	
//}
//public class Test220523 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(1, 5);
//		list.remove(2);
////		System.out.println(list);
////		System.out.println(list.get(2));
////		
////		System.out.println("5가 들어있는지 없는지 찾기 : "+list.contains(Integer.valueOf(5)));
////		System.out.println("5가 들어있는지 없는지 찾기 : "+list.contains(5));//5가 자동으로 Integer.valueOf(5) 로 됨
//		
//		
//		LinkedList<MyData> list2 = new LinkedList<>();
//		list2.add(MyData.create(1));
//		list2.add(MyData.create(2));
//		list2.add(MyData.create(3));
//		System.out.println(list2);
//		System.out.println();
//		
//		// false 나옴! 이유 => Object 종류가 다르기 때문? => equals를 Overried하면 갑자기 ture 뜸
//		System.out.println("list2에 2라는 숫자가 존재하는지?");
//		System.out.println(list2.contains(MyData.create(2)));
//		System.out.println();
//		
//		
//		System.out.println("3이 몇번째 인덱스에 있는지 확인하기");
//		System.out.println(list2.indexOf(MyData.create(3))); //0, 1, 2번째에 있어서 2가 출력됨
//		System.out.println();
//		
//		System.out.println("리스트가 비어있는지 확인");
//		System.out.println(list2.isEmpty());
//		System.out.println();
//		
//		List<MyData> list3 = new Vector<>();//벡터형 인데, 리스트형으로도 표현가능하다. 표현할 수 있는 형이 많다 => 다형성
//		method(list3);
//		System.out.println();
//		
//		//ArrayList
//		List<MyData> list4 = new ArrayList<>();
//		method(list4);
//		System.out.println();
//		
//		//언제 어떤 리스트를 써야하나? 각각의 특징이 뭐지?
//		/*
//		 * 1. LinkedList
//		 *  - DoubleLinkedList로 구현되어있음
//		 *  - List, Deque Interface를 implement 하고있음
//		 *  - 데이터가 많을 때 탐색을 위해서 많은 연산을 수행해야함 
//		 *  
//		 * 2. ArrayList
//		 *  - Resizable Array를 구현하고있음.
//		 *   => 내부에 Array를 가지고있고, 필요에 따라서 크기를 재설정한다 => Array를 새로 더 크게 만들어서 기존 값 + 새 값을 복사
//		 *   => ArrayList의 생성자에는 int initialCapacity 라는 인스턴스가 포함되어있음
//		 *   (https://docs.oracle.com/javase/8/docs/api/index.html의 Constructor Summary 참고)
//		 *   => 그래서 initialCapacity를 설정했을 경우,처음 만들어지는 Array에서 몇개를 만들거냐..하고 정해줄 수 있음
//		 *   ex) List<MyData> list4 = new ArrayList<>(10); // 10개를 미리 만들어놓겠다
//		 *   
//		 * 3. Vector
//		 *  - growable Array of Object를 implement 하고있음 (= 내부에 Array를 가지고 있는데 그게 growable하다)
//		 *  - growable 은 resizable이랑 비슷하다.
//		 *  - 얘도 initialCapacity를 가지고 있는데, capacityIncrememt 변수를 통해 몇개씩 늘릴지도 지정이 가능
//		 *  
//		 *  
//		 * ? ArrayList랑 Vector랑 똑같은거 아닌가요?
//		 *  - ArrayList : synchronized 되어있지 않음
//		 *  
//		 *  - Vector : synchronized 되어있음(값을 추가, 삭제시 동기화됨).
//		 *  		   thread-safe한 implement가 필요하지 않다면, ArrayList 사용을 추천함
//		 *  		   멀티쓰레드 환경에서 thread-safe를 위해 Vector사용이 좋음
//		 * */
//		/*
//		 * 정리!
//		 * LinkedList
//		 * List 인터페이스로 구현되어 있었음
//		 * List 인터페이스로 구현된 클래스 중 자주 사용되는 것들 : ArrayList(not sync), Vector(sync)
//		 * */
//		
//	}
//	static void method(List<MyData> list) {
//		System.out.println("List : :"+list);
//		System.out.println("size : "+list.size());
//		System.out.println("비어있나요? "+list.isEmpty());
//	}
//
//}
