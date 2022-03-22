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

public class LoopEx22_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = ran.nextInt(100) + 1;
		System.out.println("치트키 = " + com);
		
		int score = 100;
		int wrongAnswerCnt = 0;
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println("숫자 입력[1~100] : ");
			int me = scan.nextInt();
			
			if (com > me) { 
				System.out.println("up");
				wrongAnswerCnt++;
			}
			else if (com < me) {
				System.out.println("down");
				wrongAnswerCnt++;
			}
			else if (com == me) {
				System.out.println("Bingo!");
				break;
			}
		}
		
		score = score - ( 5 * wrongAnswerCnt);
		System.out.println("성적 = " + score + "점");
		
		scan.close();

	}

}
