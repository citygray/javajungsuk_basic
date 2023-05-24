package collection;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Comparator와  Comparable 예제
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr); //String의 Comparable 구현에 의한 정렬
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr,String.CASE_INSENSITIVE_ORDER);//대소문자 구분안함
		System.out.println("strArr="+Arrays.toString(strArr));
		
		//Arrays.sort(arr,Comparator) - 지정한 Comparator에 의한 정렬
		//Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자 할때
		Arrays.sort(strArr, new Descending());//역순정렬
		System.out.println("strArr="+Arrays.toString(strArr));
		

	}

}

@SuppressWarnings("rawtypes")
class Descending implements Comparator{
	@SuppressWarnings("unchecked")
	public int compare(Object o1,Object o2) {//o1과 o2 비교
		
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable<Comparable> c1 = (Comparable<Comparable>) o1;
			Comparable c2 = (Comparable) o2;
			
			return c1.compareTo(c2)* -1; //-1을 곱해서 기본 정렬방식의 역으로 변경한다
		}
		
		return -1;
	}
}