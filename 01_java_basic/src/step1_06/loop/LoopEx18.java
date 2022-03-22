package step1_06.loop;

import java.util.Scanner;

/*
 * # do while문
 * 
 * [ 형식 ]
 * 
 * do {
 * 	   반복할 명령어;
 * } while ( 조건식 );
 * 
 * 
 * 1. while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
 * 		( while    : 반복 조건식을 먼저 검사 )
 * 		( do~while : 일단 한번 실행한 후 반복조건을 검사 )
 * 
 * 2. while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다. *****
 *  
 * */

public class LoopEx18 {

	public static void main(String[] args) { 
		
		Scanner scan = new Scanner(System.in);
				
		int num1 = 0;
		
		while (num1 > 0 && num1 < 4) {
			System.out.print("(while) 숫자 1,2,3을 입력하세요 : ");
			num1 = scan.nextInt();
		}
		
		System.out.println();
		int num2 = 0;
		
		do { 
			System.out.print("(do_while) 숫자 1,2,3을 입력하세요 : ");
			num2 = scan.nextInt();
		} while (num2 > 0 && num2 < 4); 

	}

}
