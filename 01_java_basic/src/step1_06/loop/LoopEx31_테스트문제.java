package step1_06.loop;

/*
 
 	(for문)
 
	# 문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력
	# 답 : 63
	
	# 문제2) 8로 나누면 5가 남는수 중 150보다 적은수중에 가장 가까운수를 구하시요 ( 절대값 사용 x )
	# 답 149
	
	# 문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?
	# 답 6 (54,63,72,81,90,99)
	
	# 문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.
	# 답 980
	
	# 문제5) 8의 배수를 작은수부터 5개 출력
	# 답 : 0,8,16,24,32
	
*/

public class LoopEx31_테스트문제 {

	public static void main(String[] args) {
		
		System.out.println("문제1) 9의 배수중 십의 자리가 6인 첫번째 배수 출력");
		System.out.print("답 : ");
		
		for (int i = 1; i < 10; i++) {
			
			int num9 = 9*i;
			int loc10 = num9 / 10;
			
			if (loc10 == 6) {
				System.out.print(num9);
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.println("문제2) 8로 나누면 5가 남는수 중 150보다 작은 수 중에 가장 가까운수를 구하시요 ( 절대값 사용 x )");
		System.out.print("답 : ");
		
		int maxNum5 = 0;
		
		for (int i = 1; i < 150; i++) {
			
			int num = i % 8;
			
			if(num == 5) {
				if (i > maxNum5) maxNum5 = i;
			}
		} 
		System.out.print(maxNum5);
		
		
		System.out.println();
		System.out.println();
		System.out.println("문제3) 50에서 100까지 자연수중에서 9의 배수는 모두 몇개입니까?");
		System.out.print("답 : ");
	
		int cnt9 = 0;
		
		for (int i = 50; i < 100; i++) {
			
			int num = i % 9;
			if(num == 0) cnt9++;

		}
		System.out.print(cnt9);
		
		System.out.println();
		System.out.println();
		System.out.println("문제4) 28의 배수 중에서 가장 큰 세자리 수를 구하시요.");
		System.out.print("답 : ");
		
		int maxNum = 0;
		int num28 = 0;
		
		for (int i = 1000; i > 1; i--) {
			
			int num = i % 28;
			
			if (num == 0) {
				num28 = i;
				if (num28 > maxNum) maxNum = num28;
			}
		}
		System.out.print(maxNum);
		
		System.out.println();
		System.out.println();
		System.out.println("문제5) 8의 배수를 작은수부터 5개 출력");
		System.out.print("답 : ");
		
		int cnt = 0;
		
		for (int i = 0; i < 50; i++) {
			int num = i % 8;
			if (num == 0) {
				cnt++;
				System.out.print(i +" ");
				
				if (cnt == 5) break;
			}
		}
	}

}
