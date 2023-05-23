package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		// ArrayList 예제
		ArrayList <Integer> list1 = new ArrayList<Integer>(10);
		//list1.add(new Integer(5));
		list1.add(Integer.valueOf(5));
		list1.add(Integer.valueOf(4));
		list1.add(Integer.valueOf(2));
		list1.add(Integer.valueOf(0));
		list1.add(Integer.valueOf(1));
		list1.add(Integer.valueOf(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		System.out.println("list1.containAll(list2):"+list1.containsAll(list2));
	
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1, list2);
		
		list2.set(3, "AA");
		System.out.println(list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지느 삭제한다.
		System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		//오류: 인덱스 앞에서 부터 삭제하면 인덱스가 변경되어 원하는 값이 나오질 않는다.
		/*
		for(int i = 0;i<list2.size();i++) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		*/
		
		print(list1,list2);
		for(int i=list2.size()-1;i>=0;i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1,list2);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1 );
		System.out.println("list2:"+list2 );
		System.out.println();
	}

}
