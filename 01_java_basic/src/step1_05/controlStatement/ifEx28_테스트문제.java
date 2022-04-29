package step1_05.controlStatement;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class ifEx28_테스트문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.print("가위(0)바위(1)보(2) 나의 왼쪽 입력 :");
		int meLeft = scan.nextInt();
		
		System.out.print("가위(0)바위(1)보(2) 나의 오른쪽 입력 :");
		int meRight = scan.nextInt();
		
		System.out.print("둘 중 하나 입력(왼쪽 : 3 / 오른쪽 : 4) :");
		int meFinal = scan.nextInt();
		
		if (meFinal == 3) meFinal = meLeft;
		if (meFinal == 4) meFinal = meRight;
		

		int comLeft = ran.nextInt(3);
		int comRight = ran.nextInt(3);
		
		int comFinal = ran.nextInt(2);
		
		if (comFinal == 0) comFinal = comLeft;
		if (comFinal == 1) comFinal = comRight;		
		
		
		if (comFinal == meFinal) System.out.println("\n비김");
		
		else if (meFinal == 0 && comFinal == 2 || meFinal == 1 && comFinal == 0 || meFinal == 2 && comFinal == 1) {
			System.out.println("\n이겼다");
		}
		
		else System.out.println("\n졌다");
	
		
		System.out.println("\n나의 답 : " + meFinal + " vs 컴퓨터의 답 : " + comFinal);
		
		scan.close();
		
		
	}

}
