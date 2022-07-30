package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
class Student{
	String name;
	int kor;
	int eng;
	int math;
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String toString() {
		return name+" "+kor+" "+eng+" "+math+"\n";
	}
	
	
}
public class Q10825_정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Student> std = new ArrayList<Student>();
		StringTokenizer st;
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			String name = st.nextToken();
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int math = Integer.parseInt(st.nextToken());
			std.add(new Student(name, kor, eng, math));
		}
		
		Collections.sort(std, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				if(o1.kor == o2.kor) {
					if(o1.eng == o2.eng) {
						if(o1.math == o2.math) {
							return o1.name.compareTo(o2.name);
						}
						return Integer.compare(o2.math, o1.math);
					}
					return Integer.compare(o1.eng, o2.eng);
				}
				return Integer.compare(o2.kor, o1.kor);
			}
			
		});
		for(int i=0;i<N;i++) {
			System.out.println(std.get(i).name);
		}
	}

}
