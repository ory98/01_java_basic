package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("dbMoney1 = " + dbMoney1 + "원");
			System.out.println("dbMoney2 = " + dbMoney2 + "원");
			
			System.out.print("# 상태 : ");
			if (identifier == -1) System.out.println("로그아웃");
			if (identifier == 1) System.out.println(dbAcc1 + "로그인");
			if (identifier == 2) System.out.println(dbAcc2 + "로그인");
			System.out.println();
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			System.out.println();
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			int acc = 0;
			int pw = 0;
			int money = 0;
			
			if (sel == 1) {
				
				if (identifier == -1) {
					System.out.print("계좌 입력 : ");
					acc = scan.nextInt();
					
					System.out.print("비밀번호 입력 :");
					pw = scan.nextInt();
					
					if (acc == dbAcc1 && pw == dbPw1) {
						System.out.println(dbAcc1 +"님, 환영합니다..");
						identifier = 1;
					}	
					else if (acc == dbAcc2 && pw == dbPw2) {
						System.out.println(dbAcc2 +"님, 환영합니다..");
						identifier = 2;
					}	
					else System.out.println("계좌번호 확인");
					
				}
				else System.out.println("로그아웃 후에 이용하세요.");
				
			}
			
			else if (sel == 2) {
				
				if (identifier != -1) {
					System.out.println("로그아웃 되었습니다.");
					identifier = -1;
				}
				else System.out.println("로그인 후 이용하세요.");
				
			}
			
			else if (sel == 3) {
				
				if (identifier != -1) {
					
					System.out.print("입금할 금액 입력 : ");
					money = scan.nextInt();
					
					if (identifier == 1) {
						dbMoney1 += money;
					}
					else if (identifier == 2) {
						dbMoney2 += money;
					}
					
					System.out.println("입금 완료하였습니다.");
				}
				
				else System.out.println("로그인 후 이용가능");
				
			}
			
			else if (sel == 4) {
				
				if (identifier != -1) {
					
					System.out.print("출금할 금액 입력 : ");
					money = scan.nextInt();
					
					if (identifier == 1) {
						if(money <= dbMoney1) {
							dbMoney1 -= money;
							System.out.println("출금 완료하였습니다.");
						}
						else System.out.println("계좌 잔액 부족 ");
					}
					else if (identifier == 2) {
						if (money <= dbMoney2) {
							dbMoney2 -= money;
							System.out.println("출금 완료하였습니다.");
						}
						else System.out.println("계좌 잔액 부족 ");
					}
				}
				
				else System.out.println("로그인 후 이용가능");
					
			}
			
			else if (sel == 5) {
				
				if (identifier != -1) {
					System.out.print("이체할 계좌번호 입력 : ");
					acc = scan.nextInt();
					
					if (acc == dbAcc2) {
						System.out.print("이체할 금액 입력 : ");
						money = scan.nextInt();
						
						if (money <= dbMoney1) {
							dbMoney1 -= money;
							dbMoney2 += money;
						}
						else System.out.println("잔액 부족 / 이체 불가");

					}
					else if (acc == dbAcc1) {
						System.out.print("이체할 금액 입력 : ");
						money = scan.nextInt();
						
						if (money <= dbMoney2) {
							dbMoney2 -= money;
							dbMoney1 += money;
						}
						else System.out.println("잔액 부족 / 이체 불가");
					}
					
					else System.out.println("계좌번호 확인");
				}
				
				else System.out.println("로그인 후 이용가능");
				
			}
			else if (sel == 6) {
				
				if (identifier != - 1) {
					System.out.println("dbMoney1 : " + dbMoney1 + "원");
					System.out.println("dbMoney2 : " + dbMoney2 + "원");
				}
				
				else System.out.println("로그인 후 이용가능");
			}
			
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
