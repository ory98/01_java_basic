package step1_02.variable;
/*
 * 
 *  # 변수 ( variable ) 변수이름 매우 중요 - 누구나 보기 편하고 알기 쉽게 
 *  
 *  - 단 하나의 값을 저장할 수 있는 메모리 공간 ex) 전화번호부
 *  
 *  	1) 변수의 선언 그리고 초기화
 *  	
 *  	변수의 선언 	: int nData;	// 메모리 공간 할당
 *  	변수의 초기화	: nData = 0;    // 값 저장
 *  
 *  	
 *  	2) 변수의 선언과 동시에 초기화
 *  	
 *  	int nData = 0;
 *  	
 *  
 *  	3) 변수의 특징
 *  	
 *  	3-1) 변수는 변수 하나당 값을 한개만 저장할 수 있다. [ 고유성 ]
 *  	3-2) 새로운 값이 변수에 저장되면 이전값은 사라진다.
 *  
 * 
 * */
public class VariableEx01 {

	public static void main(String[] args) {
		
		
		// 1. 정수 : Integer(int)
		int memberAge;		            // 변수의 선언(비어있지 않고 가비지데이터가 들어있다.) // 27억까지 가능 
		memberAge = 20;                 // 데이터 저장 
		System.out.println(memberAge);  // 확인
		
		// 2. 실수 : double
		double memberweight = 80.14;
		System.out.println(memberweight);
		
		// 3. 문자 1개 : char
		char memberGenderEng = 'm';
		char memberGenderKor = '여';
		System.out.println(memberGenderEng);
		System.out.println(memberGenderKor);
		
		// 4. 문자열 : String 
		String subjectName = "web developement"; 
		System.out.println(subjectName);
		
		// 5. 참과거짓 : boolean 
		boolean isFirstMember = true;
		System.out.println(isFirstMember);
		
		int tempData = 10; // 새로 만들기
		// int tempData = 7; >> error : 변수명은 유일해야함.
		
		tempData = 7;      // 수정하기 
		tempData = 3;    
		System.out.println(tempData); // 가장 최근 데이터 1개만 저장됨.
		
		
	}

}
