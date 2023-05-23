package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		// Iterator예제
		
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--for문--");
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
