package day05;

import java.util.Scanner;

public class dddd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;

		while (true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입급 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) { // 예금주 계좌번호 잔액
				System.out.print("예금주 > ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기 입금액 > ");
				balance[cnt] = sc.nextInt();

				cnt++;

			} else if (menu == 2) { // 입금계좌 입금금액
				System.out.print("입금할 계좌> ");
				String inAccount = sc.next();
				System.out.print("입금할 금액> ");
				int inMoney = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (inAccount.equals(account[i])) {
						balance[i] += inMoney;
						System.out.println("입금완료");
						break;
					}
				}

			} else if (menu == 3) { // 출금계좌 출금금액
				System.out.print("출금할 계좌> ");
				String outAccount = sc.next();
				System.out.print("출금할 금액> ");
				int outMoney = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (outAccount.equals(account[i])) {
						balance[i] -= outMoney;
						System.out.println("출금완료");
						break;
					}

				}
			} else if (menu == 4) { // 계좌목록

			} else {

			}

		}

	}

}
