package day07;

import java.util.Scanner;

public class Ex01_login_account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10]; // 회원이름
		String[] id = new String[10]; // 회원아이디
		String[] pw = new String[10]; // 회원비밀번호
		String[] account = new String[10]; // 회원계좌번호
		int[] balance = new int[10];
		int cnt = 0;
		int loginIndex = -1;

		while (true) {
			System.out.println("=====스마트뱅킹=====");
			if (loginIndex != -1) {
				System.out.println("1.마이페이지 2.로그아웃 3.입금 4.출금 5.계좌이체 0.종료"); // 로그인시
			} else {
				System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료"); // 비로그인시
			}

			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (loginIndex != -1) {
					// 마이페이지
					System.out.println("이름\t아이디\t비밀번호\t계좌번호\t통장 잔고");
					System.out.println("===========================================");

					for (int i = 0; i < cnt; i++) {
					}
					System.out.printf("%s\t%s\t%s\t%s\t%d\n", name[loginIndex], id[loginIndex], pw[loginIndex],
							account[loginIndex], balance[loginIndex]);

				} else {
					System.out.print("이름> ");
					name[cnt] = sc.next();
					System.out.print("아이디> ");
					id[cnt] = sc.next();
					System.out.print("비밀번호> ");
					pw[cnt] = sc.next();
					System.out.print("계좌번호> ");
					account[cnt] = sc.next();
					System.out.println(name[cnt] + "님 회원가입을 축하드립니다");
					cnt++;
				}
			} else if (menu == 2) {
				if (loginIndex != -1) {
					// 로그아웃
					System.out.print("로그아웃 하시겠습니까? Y/y ");
					String logOut = sc.next();

					if (logOut.equals("Y") || logOut.equals("y")) {
						System.out.println(name[loginIndex] + "님 로그아웃 되었습니다.");
						loginIndex = -1;
					}

				} else {
					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 비밀번호> ");
					String loginPw = sc.next();
					boolean find = false;

					for (int i = 0; i < cnt; i++) {
						if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
							System.out.println(name[i] + "님 반갑습니다!");
							find = true;
							loginIndex = i;
							break;
						}
					}
					if (find == false) {
						System.out.println("로그인 실패");
					}
				}
			} else if (menu == 3) {
				if (loginIndex != -1) {
					// 입금
					System.out.println("-----입금-----");
					System.out.print("입금 계좌번호 입력 : ");
					String inAccount = sc.next();
					System.out.print("입금할 금액 입력 : ");
					int sendMoney = sc.nextInt();

					for (int i = 0; i < cnt; i++) {
						if (account[i].equals(inAccount)) {
							balance[i] += sendMoney;
						} else if (account[i].equals(inAccount)) {
							System.out.println("일치하는 계좌가 없습니다.");
						}

					}

				} else {
					System.out.println("이름\t아이디\t비밀번호\t계좌번호");
					System.out.println("=====================================");
					for (int i = 0; i < cnt; i++) {
						System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], account[i]);
					}
				}
			} else if (menu == 4 && loginIndex != -1) {
				// 출금
				System.out.println("-----출금-----");
				System.out.print("받을 계좌번호 입력 : ");
				String inAccount = sc.next();
				System.out.print("비밀번호 입력 : ");
				String icPw = sc.next();
				System.out.println("보낼 금액 입력 : ");
				int outMoney = sc.nextInt();
				boolean find = false;

				for (int i = 0; i < cnt; i++) {
					if (account[i].equals(inAccount)) {
						find = true;
						if (pw[loginIndex].equals(icPw)) {

							if (balance[loginIndex] >= outMoney) {
								System.out.println("이체가 성공하였습니다.");
								break;
							} else {
								System.out.println("한도초과로 이체하지 못했습니다.");

							}
						} else {
							System.out.println("비밀번호가 틀렸습니다.");

						}
					}
					if (find == false) {
						System.out.println("없는 계좌번호입니다.");

					}

				}

			} else if (menu == 5 && loginIndex != -1) {
				// 계좌이체
				System.out.println("-----계좌이체-----");

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("스마트뱅킹 종료!");
	}

}