package collection;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		// HashSet 예제3
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("nanee",10));
		set.add(new Person("nanee",10));
		
		System.out.println(set);
	}

}
class Person{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {return name +":"+age;}
	
	// 아래 두 메서드를 오버라이딩 해야 Person 인스턴스의 이름과 나이가 같으면 중복으로 처리한다.
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age==p.age;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
}
