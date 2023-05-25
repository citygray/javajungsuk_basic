package ch11_collection;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {
	public static void main(String[] args) {
		//TreeSet 예제1
		Set set = new TreeSet();
		
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		//TreeSet은 저장할때 이미 정렬하기 때문에 따로 정렬이 필요없다.
		System.out.println(set);
		
		
		
	}

}
