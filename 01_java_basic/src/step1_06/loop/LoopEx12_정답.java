package step1_06.loop;

/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while (i <= 50) {
			
			int loc10 = i / 10;
			int loc1 = i % 10;
			
			int cnt369 = 0;
			
			if (loc10 != 0 && loc10 % 3 ==0) cnt369++;
			if (loc1 != 0 && loc1 % 3 ==0) cnt369++;
		
			if 		(cnt369 == 2) System.out.print("짝짝 " );
			else if (cnt369 == 1) System.out.print("짝 ");
			else 				  System.out.print(i + " ");
			
			i++;
			
		}

	}

}
