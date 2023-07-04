package day08;

import java.util.Scanner;

public class 복습3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;
		boolean find = false;

		while (true) {
			System.out.println("=====계좌생성=====");
			System.out.println("1.계좌생성 2.입급 3.출금 4.계좌목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) { // 계좌생성
				System.out.println("-----계좌생성-----");
				System.out.print("예금주 이름 : ");
				name[cnt] = sc.next();
				System.out.print("사용 할 계좌번호 : ");
				account[cnt] = sc.next();
				System.out.print("최초입금금액 : ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + "님 회원가입을 축하합니다!");
				cnt++;

			} else if (menu == 2) {
				// 입금 할 계좌번호 입력받고
				// 입금금액 입력받고, 입금 할 계좌를 account배열에서 찾아 입금
				System.out.println("-----입금창구-----");
				System.out.print("받을 계좌번호 입력 : ");
				String inAccount = sc.next();
				System.out.print("입금 금액 입력 : ");
				int inMoney = sc.nextInt();

				for (int i = 0; i < cnt; i++) {

					if (account[i].equals(inAccount)) {
						balance[i] += inMoney;
						System.out.println(name[i] + "님께 " + inMoney + "원 입금 성공!");
						find = true;
						break;
					}
				}
				if (!find) { // if(find = false); 안되는 이유는 뭐지
					System.out.println("없는 계좌번호입니다.");
				}
			} else if (menu == 3) {
				// 출금 할 계좌번호, 출금금액 입력받고,
				// 출금할 계좌를 account배열에서 찾아 입금
				// 잔액부족 표시
				System.out.println("-----출금창고-----");
				System.out.print("출금 할 계좌번호 입력 : ");
				String outAccount = sc.next();
				System.out.print("출금 금액 입력 : ");
				int outMoney = sc.nextInt();

//				boolean find = false;
				for (int i = 0; i < cnt; i++) {
					if (account[i].equals(outAccount)) {
						if (balance[i] >= outMoney) {
							find = true;
							System.out.println(name[i] + "님 계좌에서 " + outMoney + "원 출금 성공!");
						} else {
							System.out.println("통장잔고가 출금액보다 적습니다.");
							System.out.println("출금 실패!");
						}
					}
				}
				if (!find) { // true
					System.out.println("없는 계좌번호입니다.");
					System.out.println("다시 확인하십시오.");
				}
			} else if (menu == 4) {
				// name배열, acoount배열, balance배열의 모든 값을
				// 0번째 방부터 출력
				System.out.println("이름\t계좌번호\t통장잔고");
				System.out.println("===============================");

				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%d\n", name[i], account[i], balance[i]);
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("0~4까지만 입력가능합니다.");
			}

		}
		System.out.println();
	}

}
if(true) {

}
	
}