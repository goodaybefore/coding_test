package com.programmers.lecture;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

//종류별 정렬 알고리즘을 학습하는 이유
/* 1. 다양한 알고리즘을 학습하면서 문제 풀이의 접근 방식도 함께 학습
 * 2. 문제를 해결하는 알고리즘은 한가지가 아니라는 것, 효율성이 달라지는 것을 알 수 있음 => 절대적인 것은 없다.
 * 
 * */
class MyData implements Comparable<MyData>{
	int v;
	public MyData(int v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return String.valueOf(v);// ""+v보다는 권장되는 방법(Java의 기능을 적극적으로 사용)
	}
	
	@Override
	public int compareTo(MyData o) {
//		return v - o.v;
		return Integer.compare(v, o.v);//이게 더 권장되는 기능
	}
	
}
public class CollectionSort_강의 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Random r = new Random();
		for(int i=0;i<20;i++) list.add(r.nextInt(50));
		System.out.println("original list");
		System.out.println(list);
		
		//간단 정렬 
		System.out.println("simple sort");
//		list.sort(Comparator.naturalOrder());//오름차순 정렬
//		list.sort(Comparator.reverseOrder());//내림차순 정렬
		
		
		System.out.println("Comparator");//Comparator : 함수형 인터페이스
		//함수형 인터페이스? => 1개의 추상메소드를 갖고 있는 인터페이스를 의미 => 자바의 람다식은 함수형 인터페이스로만 접근이 가능하기 때문에 주로 사용
		/* 람다식? => '익명함수' 라고도 부름.
		 * 장점) 불필요한 반복문의 삭제가 가능(코드의 간결성) / 불필요한 연산을 최소화(지연연산수행) / 멀티쓰레드를 이용한 병렬처리 사용(병렬처리가능)
		 * 단점) 호출이 까다로움 / 람다 stream 사용 시 단순 for문, while문의 성능이 떨어짐 / 불필요하게 많이 사용하면 가독성 down
		 * 표현식) 람다는 매개변수 화살표(->{} ) 형식으로 사용할 수 있음 / 함수 몸체({})가 단일 실행이면 괄호 생략 가능 / 함수 몸체가 return 문이 있으면 괄호 생략 불가능
		 * 참고링크) https://khj93.tistory.com/entry/JAVA-%EB%9E%8C%EB%8B%A4%EC%8B%9DRambda%EB%9E%80-%EB%AC%B4%EC%97%87%EC%9D%B4%EA%B3%A0-%EC%82%AC%EC%9A%A9%EB%B2%95
		 * */
		
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				//Integer 라고 명시되어있는데 굳이 intValue() 사용하는 이유??
//				//parseInt() : static 이므로 Integer을 생성하지 않고 parameter만 넣엉주면 메소드를 수행 가능
//				//				String 형 객체에서 int형 값을 뽑아내는 메소드 / 문자형을 정수형으로 만든다
//				//intValue() : static이 아니며 Integer 객체에서 int형 값을 뽑아내는 메소드
//				//				Integer는 int Value와 String Value 두가지가 있다.
//				
//				//-연산을 할수있따는걸 알고있기 때문에 쓸수있음
////				return o1.intValue() - o2.intValue();//오름차순 정렬
////				return o2.intValue() - o1.intValue();//내림차순 정렬
//				//-연산을 할 수 없다면?
//				return o2.compareTo(o1);//내림차순
//				}
//		});
		
		//Comparator는 함수형 인터페이스라서 람다식이 가능하기 때문에 이렇게도 표현가능
		list.sort((o1, o2) -> o2.compareTo(o1));
//		list.sort(Comparator.reverseOrder());
		
		
		System.out.println(list);
		System.out.println();
		
		
		System.out.println("list2 : MyData 사용");
		List<MyData> list2 = new LinkedList<MyData>();
		for(int i=0;i<20;i++) list2.add(new MyData(r.nextInt(50)));
		System.out.println(list2);
		list2.sort(new Comparator<MyData>() {

			@Override
			public int compare(MyData o1, MyData o2) {
				return o2.compareTo(o2);
			}
		});
		
		//compareTo를 쓰고싶거나, list2.sort(Comparator.naturalOrder())나 reverseOrder를 사용하고 싶다면,
		//MyData 객체가 대소비교가 가능한 형태여야 한다 => MyData에 Comparator를 implements 해서 compare를 정의해준다.
		list2.sort(Comparator.naturalOrder());
		
		System.out.println(list2);
		System.out.println();
		
		
		//정렬알고리즘 실제 구현
		System.out.println("list3 : Quick Sort 구현");
		List<MyData> list3 = new LinkedList<MyData>();
		for(int i=0;i<20;i++) list3.add(new MyData(r.nextInt(50)));
		System.out.println(list3);
		list3 = quickSort(list3);
		System.out.println(list3);
	}
	static List<MyData> quickSort(List<MyData> list){
		if(list.size() <= 1) return list;
		
		//pivot 값 정하기(암거나 꺼내기)
		MyData pivot = list.remove(0);
		List<MyData> lesser = new LinkedList<MyData>();
		List<MyData> greater= new LinkedList<MyData>();
		
		//그룹을 나누기
		for(MyData m : list) {
			//pivot vs m > 0 이면? --> pivot이 m보다 크다는 뜻 --> m을 lesser에 add
			if(pivot.compareTo(m) > 0) lesser.add(m);
			else greater.add(m);
		}
		
		List<MyData> merged = new LinkedList<MyData>();
		//다시 모으기(오름차순)
		merged.addAll(quickSort(lesser));
		merged.add(pivot);
		merged.addAll(quickSort(greater));
		//다시 모으기(내림차순)
//		merged.addAll(quickSort(greater));
//		merged.add(pivot);
//		merged.addAll(quickSort(lesser));
		
		
		
		//나누고 모으기를 반복해야함
		return merged;
	}
}
