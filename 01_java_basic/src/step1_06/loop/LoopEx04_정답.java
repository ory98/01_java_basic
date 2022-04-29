package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */


public class LoopEx04_정답 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		Random ran = new Random();
		
		int correctCnt = 0;
		
		int i = 0;
		
		while (i <= 5) {
			
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			int correct = x*y;
			
			System.out.println(x + " X " + y +" = " + " ? " );
			System.out.print("정답 입력 :");
			int answer = scan.nextInt();
			
			if (answer == correct) 	correctCnt++;
			i++;
		}
		
		int score = 20 * correctCnt;
		System.out.println("점수는 = " + score + "점");
		
		scan.close();
		
		
		
		
		
	}

}
