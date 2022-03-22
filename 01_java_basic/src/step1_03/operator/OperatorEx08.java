package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장		    +=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장    %=
 *  6) 변수의 값에 1을 더한 후 저장	            ++
 *  7) 변수의 값에 1을 뺀 후 저장	            --
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {
		
		int tempData1 =100; 
		tempData1 -= 3; // tempData1 = tempData1 - 3;
		System.out.println(tempData1);
		
		int tempData2 = 30000;
		tempData2 += 50000; // tempData2 = tempData2 + 50000;
		System.out.println(tempData2);
		
		int tempData3 = 200000;
		tempData3 *= 2; // tempData3 = tempData3 * 2;
		System.out.println(tempData3);
		
		System.out.println();
		
		// [참고] 변수++ , 변수-- 와 ++변수 , --변수의 차이점 (명령어 실행의 순서의 차이)
		int x = 0;
		x++; // x += 1; // x = x + 1; // 순서의 영향이 없음
		System.out.println(x);
		++x; // x += 1; // x = x + 1; // 순서의 영향이 없음 
		System.out.println(x);
		System.out.println();
		
		int y = 0;
		System.out.println(y++); // 좌측의 명령어를 실행 후 y를 증가
		System.out.println(y);
		System.out.println();
		
		int z = 0;
		System.out.println(++z); // z를 증가 후 명령어를 수행 
		System.out.println(z);
		System.out.println();
				
	}
}
