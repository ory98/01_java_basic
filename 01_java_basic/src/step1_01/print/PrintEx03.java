package step1_01.print;

public class PrintEx03 {

	public static void main(String[] args) {
		
		/*
		 * 
		 *  # 이스케이프 문자 ( escape sequence ) 
		 * 
		 * 	1) \n : 줄바꿈
		 *  2) \t : tab
		 *  3) \" : 문자 자체 " (문법x) "문자"
		 * 
		 */
		
		System.out.println("1. 로그인\n2. 회원가입\n3. 종료");
		System.out.println("1. 로그인\t2. 회원가입\t3. 종료");
		System.out.println("\"안녕하세요.\"");
		System.out.println();
		
		 /* 
		 *  서식 문자 출력
		 *  System.out.printf(); 글자만 사용가능 , 엔터가 불가능(\n 넣어서 가능) 
		 *  
		 *  1) %d : 정수
		 *  2) %f : 실수
		 *  3) %c : 단일 문자
		 *  4) %s : 문자열
		 *  
		 *  5) %.1f : 소수점 1자리 까지 출력(반올림)
		 * 	   %.2f : 소수점 2자리 까지 출력(반올림)
		 *     %.3f : 소수점 3자리 까지 출력(반올림)
		 */
		System.out.printf("%d\n" , 10);  
		System.out.printf("%f\n" , 3.14); //6자리 맞춰서 나옴 
		System.out.printf("%.1f\n" , 3.14); // 소수점 제어 
		System.out.printf("%.2f\n" , 3.14);
		System.out.printf("%.3f\n" , 3.14);
		
		System.out.printf("%c\n" , '#');
		System.out.printf("글자\n");
		System.out.printf("%s\n" , "글자");
		
		System.out.printf("총점 : %d , 평균 : %.1f\n" , 290 , 290 / 3.0);
		System.out.printf("이름 : %s, 나이 : %d , 총점 : %d, 평균 : %.1f" , "제임스고슬링" , 20 , 398 , 398 / 4.0);
		
		
	}

}
