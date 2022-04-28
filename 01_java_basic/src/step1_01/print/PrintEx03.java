package step1_01.print;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		System.out.println();
		System.out.println();
		
		/*
		 * 
		 *  # Date
		 *  
		 * 	[1] 날짜 및 시간 출력 서식 지정 방법
		 *  	. 날짜 및 시간 서식에 사용되는 영문자를 제외한 나머지 문자는 입력하는 그대로 출력된다.
		 *  	. Date date = new Date();
		 *  	. SimpleDateFormat sdf = new SimpleDateFormat("날짜 및 시간 서식"); > 보기 좋은 형태
		 *  
		 *  [2] 날짜 및 시간 서식 적용 방법
		 *  	. sdf.format(date);
		 *  
		 *  [3] 날짜 및 시작 출력 서식 문자의 종류
		 *  	. 구글에서 "simpledateformat 날짜 형식" 라고 검색하기
		 *  
		 *  
		 *  # System.currentTimeMillis()
		 *   
		* 	- 1970년 1월 1일 자정 부터 이 메소드가 실행되는 순간까지 지나온 시간을 밀리초(1/1000초) 단위로 얻어온다.
		*   - 13자리의 숫자를 얻어오기 때문에 int로 처리하면 에러가 발생되므로 long로 처리해야 한다.
		*   
		*/
		
		System.out.println("\n============\n");
		
		Date date = new Date();
		System.out.println(date); // Thu Apr 28 15:12:51 KST 2022
		
		long time = System.currentTimeMillis();
		System.out.println(time); // 1651127480932
		System.out.println();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
		String date1 = sdf1.format(date);
		String date2 = sdf1.format(time);
		System.out.println("date1 : " + date1);
		System.out.println("date2 : " + date2);
		System.out.println();
		
		SimpleDateFormat sdf2 =new SimpleDateFormat("yyyyMMdd"); 
		System.out.println("date3 : " + sdf2.format(date));
		System.out.println("date4 : " + sdf2.format(time));
		System.out.println();
		
		SimpleDateFormat sdf3 =new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초"); 
		System.out.println("date5 : " + sdf3.format(date));
		System.out.println("date6 : " + sdf3.format(time));
		System.out.println();
		
		System.out.println("\n============\n");
		
		// DecimalFormat df = new DecimalFormat("숫자 서식");
		// 숫자 서식은 무조건 "#,##0"을 쓰고 필요한 문자를 앞 또는 뒤에 붙여준다.
		
		int salary1 = 10000;
		int salary2 = 100000;
		int salary3 = 1000000;
		
		DecimalFormat df = new DecimalFormat("#,##0"); // Decimal = 십진법 
		
		String number1 = df.format(salary1); // 숫자가 아닌 문자열로 표기 
		System.out.println("number1 : " + number1);
		System.out.println("number2 : $" + df.format(salary2));
		System.out.println("number3 : " + df.format(salary3) + "원");
		
	}

}
