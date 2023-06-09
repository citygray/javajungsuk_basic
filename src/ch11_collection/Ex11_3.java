package ch11_collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_3 {

	public static void main(String[] args) {
		// Stack활용 : 수식괄호검사
		
		Stack st = new Stack();
		String expression = "(((2+3)*1)+3";
		
		System.out.println(expression);
		
		try {
			for(int i = 0;i<expression.length();i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch+"");
				}else if(ch==')') {
					st.pop();
				}
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch(EmptyStackException e) {
			System.out.println("EmptyStackException");
		}
		

	}

}
