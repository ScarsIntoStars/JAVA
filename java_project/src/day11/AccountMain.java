package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<Account> list = new ArrayList<Account>();
		int fAccount = 100;

		while (true) {
			System.out.println("인천일보은행");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌목록 5.이체 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Account account = new Account();
				System.out.println("-----계좌생성-----");
				System.out.print("예금주 : ");
				account.setName(sc.next());
				System.out.print("사용할 계좌번호 : ");
				account.setAccount(sc.next());
				System.out.print("초기입금액 : ");
				account.setBalance(sc.nextInt());
				System.out.println("계좌생성");
				list.add(account);

			} else if (menu == 2) {
				System.out.println("-----입금-----");

				System.out.print("입금 할 계좌번호 : ");
				String inAccount = sc.next();
				System.out.print("입금 금액 입력 : ");
				int inMoney = sc.nextInt();
				boolean find = false;

				for (Account a : list) {
					if (a.equals(inAccount)) {
						a.deposit(inMoney);
						System.out.println("입금 성공");
						find = true;
						break;

//					if(a.getAccount().equals(inAccount)) {
//						a.setBalance(a.getBalance()+inMoney);
//					}

					}

				}
				if (!find) { // for문 밖에 있어야 반복안됨
					System.out.println("없는 계좌번호입니다.");

//					break; // 여기서 break하면 while이 끝남

				}

			} else if (menu == 3) {
				System.out.println("-----출금-----");
				System.out.print("출금계좌입력 : ");
				String outAccount = sc.next();
				System.out.print("출금금액 : ");
				int outMoney = sc.nextInt();
				boolean find = false;

				for (Account a : list) {

					if (a.equals(outAccount)) {
						if (a.getBalance() >= outMoney) {
							System.out.println("출금 성공!");
							a.deposit(outMoney);
//					if(outAccount.equals(a.getAccount())) {
//						a.setBalance(a.getBalance()-outMoney);
//					}

						} else {
							System.out.println("잔액이 부족합니다.");
						}
					}

				}
				if (!find) {
					System.out.println("없는 계좌번호입니다.");
				}

			} else if (menu == 4) {
				System.out.println("이름\t계좌번호\t통장잔고");
				System.out.println("==============================");

				for (Account a : list) {
					a.print();
				}
			} else if (menu == 5) {
				System.out.println("-----이체-----");

				System.out.print("출금 계좌번호 : ");
				String outAccount = sc.next();
				System.out.print("입금 계좌번호 : ");
				String inAccount = sc.next();
				System.out.print("보낼 금액 : ");
				int outMoney = sc.nextInt();

				int outIndex = -1;
				int inIndex = -1;
				for (int i = 0; i < list.size(); i++) {
					if (outAccount.equals(list.get(i).getAccount())) {
						outIndex = i;
					}
					if (inAccount.equals(list.get(i).getAccount())) {
						inIndex = -i;
					}
				}
				if (outIndex == -1) {
					System.out.println("출금계좌 없음");
				} else if (inIndex == -1) {
					System.out.println("입금계좌 없음");
				} else {
					if (list.get(outIndex).withdraw(outMoney)) {
						list.get(inIndex).deposit(outMoney);
						System.out.println("이체성공");
					} else {
						System.out.println("잔액부족");
					}
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}

// 지우세요
//if (menu == 1) {
//	//**********
//					Account account = new Account();
//
//					System.out.print("에금주 이름 : ");
//					account.setName(sc.next());
//
//					System.out.print("사용 할 계좌번호 입럭 : ");
//					account.setAccount(sc.next());
//					;
////					String setAccount((fAccount++)+"-") = sc.next();
//					System.out.print("초기입금액 :");
//					account.setBalance(sc.nextInt());
////					int setBalance = sc.nextInt();
//					System.out.println("계좌생성");
//					list.add(account);
//
//				} else if (menu == 2) {
//					System.out.print("입급 할 계좌번호 > ");
//					String inAccount = sc.next();
//					System.out.print("입금금액 : ");
//					int inMoney = sc.nextInt();
//
//					for (Account a : list) { // list에 있는 게 Account이기 때문에, Account a에 담아두는 것, 만약 list에 String이 들어 있으면, String a에 담아야 함
//						a.deposit(inMoney);
//						System.out.println("입금 성공");
//						break;
//					}
//
//				} else if (menu == 3) {
//					System.out.print("츨급 할 계좌번호 > ");
//					String outAccount = sc.next();
//					System.out.print("출금금액 : ");
//					int outMoney = sc.nextInt();
//
//	//**********
//					for (Account a : list) {
//						if (a.withdraw(outMoney)) { // a.withdraw(outMoney)의 출력값이 true or false이기 때문에 if문 안에 넣을 수 있음
//							System.out.println("출금성공");
//						} else {
//							System.out.println("잔액부족");
//						}
//						break;
//					}
//
//				} else if (menu == 4) {
//					System.out.println("예금주\t계좌번호\t\t잔액\t가입일");
//					System.out.println("====================================");
//					for (Account a : list) {
//						a.print();
//					}
