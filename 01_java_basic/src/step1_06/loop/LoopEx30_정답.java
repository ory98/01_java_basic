package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1   2  3  4  5
 * 10  9  8  7  6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_정답 {

	public static void main(String[] args) {
		
		int start = 1; // 시작점과 
		int end = 5;   // 끝점 지정 
		
		for (int i = 0; i < 5; i++) { // 길이 정하기 
			
			if (i % 2 == 0) { // 0번째 , 2번째, 4번째 
				for (int j = start; j <= end ; j++) { // 1-5 , 11-15 , 21-25 
					System.out.print(j + "\t");
				}
			}
			else { // 1번째, 3번째
				for (int j = end; j >= start; j--) { // 6-10 , 16-20
					System.out.print(j + "\t");
				}
			}
			
			System.out.println();
			
			start = end + 1;
			end = end + 5;
		}

	}

}
