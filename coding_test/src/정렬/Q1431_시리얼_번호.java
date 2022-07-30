package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1431_시리얼_번호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0;i<N;i++) {
			arr[i] = br.readLine();
		}
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//o1, o2 길이 비교
				if(o1.length() < o2.length()) return -11;
				else if(o1.length() == o2.length()) 
					if(add(o1) == add(o2)) return o1.compareTo(o2);//오름차순 정렬
					else return Integer.compare(add(o1), add(o2));
				else
					return 1;
			}
		});
		for(String s:arr) {
			System.out.println(s);
		}
		
	}
	public static int add(String s) {
		int sum = 0;
		for(int i=0;i<s.length();i++)
			if(s.charAt(i) >= '0' && s.charAt(i)<=9) sum+=s.charAt(i)-'0';
		return sum;
	}

}
