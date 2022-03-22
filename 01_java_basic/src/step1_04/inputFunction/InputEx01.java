package step1_04.inputFunction;

import java.util.Scanner;

/*
 * 
 * # 콘솔에 키보드로 데이터 입력받기
 * 
 * [ 순서 중요 ]
 * 
 * 1) import java.util.Scanner;  				// Scanner클래스를 불러온다.
 * 2) Scanner scan = new Scanner(System.in);    // scan 객체를 생성한다.
 * 3) System.out.println("#나이 입력: ");       // 안내문을 작성한다.
 * 4) scan.nextInt();                           // 키보드로 입력받는다.
 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다.
 * 
 * */

public class InputEx01 {

	public static void main(String[] args) {
		
		// 시작할때 한번만 생성하면 되고 보통 코드의 맨 윗줄에 작성한다.  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요: ");
		int getSalary = scan.nextInt(); // 숫자 데이터만 입력가능하다. ( 글자 데이터는 후에 공부 )

		System.out.println("입력하신 월급은 " + getSalary + "원 입니다.");
		System.out.println("세금은 " + getSalary * 0.033 + "원 입니다.");
		System.out.println("실수령액은 " + (getSalary - getSalary * 0.033) + "원 입니다.");
		
		// 코드의 맨 마지막에서 작성하면되고 보통 코드의 맨 아랫줄에 작성한다.
		scan.close();
		
	}
	

}
