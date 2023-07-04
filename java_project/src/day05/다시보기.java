package day05;

import java.util.Scanner;

public class 다시보기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] account = new String[10];
		String[] name = new String[10];
		int[] balance = new int[10];
		int cnt = 0;

		while (true) {
			System.out.println("==========인천일보은행==========");
			System.out.println("1.개설 2.입급 3.출금 4.목록 5.종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("최초입금액 : ");
				balance[cnt] = sc.nextInt();
				cnt++;

			} else if (menu == 2) {
				System.out.print("입금 할 계좌 : ");
				String inAccount = sc.next();

				if (account[cnt].equals(inAccount)) {
					System.out.print("입금 할 금액 : ");
					int inMoney = sc.nextInt();
					balance[cnt] -= inMoney;
					System.out.println(inMoney + "원 입금완료");
				} else {
					System.out.println("일치하는 계좌 없음");

				}

			} else if (menu == 3) {
				System.out.print("출금 할 계좌 : ");
				String outAccount = sc.next();

				if (account[cnt].equals(outAccount)) {
					System.out.print("출금 할 금액 : ");
					int outMoney = sc.nextInt();
					balance[cnt] -= outMoney;
					System.out.println(outMoney + "원 출금완료");
				} else {
					System.out.println("일치하는 계좌 없음");
				}

			} else if (menu == 4) { // 목록
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("======================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s \t %s \t %d \n", name[i], account[i], balance[i]);
				}
			} else if (menu == 5) { // 종료
				System.out.println("인천일보은행 종료");
				break;

			}

			System.out.println();
		}
	}

}
