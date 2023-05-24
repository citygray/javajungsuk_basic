package collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_8 {

	public static void main(String[] args) {
		// Integer와 Comparable 예제
		Integer[] arr = {30,50,10,40,20,110};
		
		Arrays.sort(arr);//Integer가 가지고 있는 기본정렬기준 compareTo()로 정렬
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr,new DescComp());
		System.out.println(Arrays.toString(arr));

	}

}

class DescComp implements Comparator<Object>{
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) 
			return -1;//Integer가 아니면, 비교하지 않고 -1반환
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		//return i2-i;
		//return i2.compareTo(i);
		return i.compareTo(i2) * -1; //기본 정렬인 compareTo()의 역순으로 정렬
	}
}
