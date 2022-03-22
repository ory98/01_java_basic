package step1_01.print;

// 2) 주석(comment) : 설명문을 작성하기 위한 방법으로 프로그램의 실행에 영향을 미치지 않는다.

// 2-1) 라인(line) 주석 : 한줄 주석 

/*
 * 
 * 2-2) 블록(block) 주석 : 여러줄 주석 
 * 
 *  언제 누구의 어떤 지시를 받아 ~코드를 이렇게 수정하였음
 *  
 * */ 

/*
 *  3) 에디터 화면 확대 및 축소 : ctrl + [+] , ctrl + [-]
 *  
 *  
 *  4) 뒤로 되돌리기(redo)  : ctrl + z
 *    앞으로 되돌리기(undo) : ctrl + y
 * 
 * 
 *  5) 저장 : ctrl + s  ,  저장하지 않았을 경우 파일명 왼쪽에 *표시가 나옴.
 *  					  ( 항상 저장하는 습관 권장 )
 *    
 *  6) 출력문 자동완성
 *  
 *  	6-1) sout + ctrl + space
 *  	6-2) sysout + ctrl + space
 *  
 *  
 *  7) 유용한 단축키 
 *  
 * 		7-1) 복사     : ctrl + alt + 위 or 아래 방향키
 * 		7-2) 이동     : alt        + 위 or 아래 방향키
 * 		7-3) 블록잡기 : shift      + 위 or 아래 방향키
 * 		7-4) 삭제     : ctrl + d
 *  
 * */
public class PrintEx01 {

	public static void main(String[] args) { // main함수의{}안에서 프로그래밍을 한다. 
		
		// tab으로 들여쓰기(소속을 보이기 위해) 이후에 코드를 작성한다. 
		
		// System.out.println(데이터) : 데이터를 화면에 출력한 뒤에 줄을 내린다. 
		System.out.println("========");
		System.out.println("메뉴 선택");
		System.out.println("========");

		// 출력데이터가 없으면 줄바꿈기능만 적용하여 한줄을 띄운다. 
		System.out.println();
		System.out.println();
		
		System.out.println("1) 로그인(login)");
		System.out.println("2) 로그아웃(logout)");
		System.out.println("3) 종료(exit)");
		
		// System.out.print(데이터) : 데이터를 화면에 출련한 뒤 줄을 바꾸지 않는다. 
		System.out.print("# 데이터를 입력하세요 : ");
		System.out.print("강남지점 ,");
		System.out.print("라이센스 계약의 건 ,");
		System.out.print("담당자 홍길동");
		
		
	}

}
