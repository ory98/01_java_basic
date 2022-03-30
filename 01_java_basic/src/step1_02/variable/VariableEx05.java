package step1_02.variable;

/*
 * 
 *  # 상수 ( constant ) 
 * 
 *  - 값이 변하지 않는 데이터
 *  - final 키워드를 사용하여 만든다.
 * 	- 변경되면 안되는 데이터의 보호를 위해 사용한다.
 *  - 특정데이터를 의미있는 문자로 사용하여 인식하기 쉽게 한다. 
 * 
 * */

public class VariableEx05 {

	public static void main(String[] args) {
		
		// 변수 
		int orderQty = 100;
		orderQty = 777; // 변경가능
		
		System.out.println(orderQty);
		
		// 상수 > 전부 대문자로 하는 것이 약속 ***
		final int CHARACTER = 1;  // > 상수명으로 프로그램 짜면 안 헷갈림. 
		final int BALL = 9;
		final int GOAL = 7; 
		
		
		// character = 11; // 변경 불가능 
		// ball = 99;
		// goal = 77; 
		
		System.out.println(CHARACTER);
		System.out.println(BALL);
		System.out.println(GOAL);

	}

}
