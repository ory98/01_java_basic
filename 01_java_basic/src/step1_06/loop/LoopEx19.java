package step1_06.loop;
/*
 *  # 반복문 for
 * 
 * 1. 반복문의 조건 3가지 
 * 		1) 초기식 2) 조건식 3) 증감식
 * 
 * 2. [ 형식 ]
 * 
 * for (초기식;조건식;증감식) {
 * 		조건식이 참일때 반복할 명령어;
 * }
 * 
 * 3. for문의 실행순서
 *  1) 초기식
 *  2) 조건식  3) 명령어  4) 증감식 
 *  조건이 false가 될때까지 2)3)4) 반복 
 * 
 * 
 * while문 >> 무한대로 사용할 때 유리
 * for문 >> 정해진 반복을 사용할 때 유리 
 * 
 * */

public class LoopEx19 {

	public static void main(String[] args) {
		
		int x = 1;                    // 초기식 (전체 영향)
		while (x <=5) {               // 조건식
			System.out.println(x);    // 명령어
			x++;                      // 증감식
		}
		
		System.out.println();
										// 초기식 (for문 안에서만 영향)
		for (int i = 1; i <= 5; i++) { // (초기식;조건식;증감식) // 초기식 처음 딱 1번 // 이후는 조건식에서 시작 
			System.out.println(i);	   //  명령어
		}
			
		// for + [ctrl + space] : for문 생성 단축기 
	}
		

}

