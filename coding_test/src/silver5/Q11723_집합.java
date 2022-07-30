package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q11723_집합 {
	static Set<Integer> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			String[] oper = br.readLine().split(" ");
			String func = oper[0];
			if(oper.length != 1) {
				int x = Integer.parseInt(oper[1]);
				switch(func) {
				case "add" :
					add(x);
					break;
				case "remove":
					remove(x);
					break;
				case "check":
					sb.append(check(x)).append("\n");
					break;
				case "toggle":
					toggle(x);
					break;
				default : break;
				}
			}else {
				switch(func) {
				case "all":
					all();
					break;
				case "empty":
					empty();
					break;
				default : break;
				}	
			}	
			
		}
		
		System.out.println(sb);
	}
	public static void add(int x) {
		set.add(x);
	}
	public static void remove(int x) {
		if(set.contains(x)) set.remove(x);
	}
	public static int check(int x) {
		if(set.contains(x)) return 1;
		else return 0;
	}
	public static void toggle(int x) {
		if(set.contains(x)) remove(x);
		else add(x);
	}
	public static void all() {
		Set<Integer> tmp = new HashSet<Integer>();
		for(int i=1;i<=20;i++) {
			tmp.add(i);
		}
		set = tmp;
	}
	public static void empty() {
		set.clear();
	}
	
	

}
