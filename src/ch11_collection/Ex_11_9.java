package ch11_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex_11_9 {

	public static void main(String[] args) {
		// HashSet 예제1
		
		Object[] objArr = {"1",Integer.valueOf(1),"2","2","3","3","4","4"};
		Set set = new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);

		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
