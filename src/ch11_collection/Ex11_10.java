package ch11_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		// HashSet 예제2
		Set set = new HashSet();
		
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(Integer.valueOf(num));
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
