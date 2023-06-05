package ch11_collection;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		//TreeSet 예제3
		TreeSet set = new TreeSet();
		int[] score = {80,95,50,35,45,65,10,100};
		
		for(int i =0;i<score.length;i++) {
			set.add(score[i]);
		}
		//headSet메서드와 tailSet메서드를 이용하면, 
		//TreeSet에 저장된 객체 중 지정된 값보다 큰값,작은 값 객체를 얻을 수 있다.
		System.out.println("50보다 작은 값: "+set.headSet(Integer.valueOf(50)));
		System.out.println("50보다 큰 값: "+set.tailSet(Integer.valueOf(50)));

	}

}
