package day07;

import java.util.Scanner;

public class GoToHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] account = new String[10];
		int[] balance = new int[10];
		int cnt = 0;

		while (true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("-----회원가입------");
				System.out.print("이름 입력 : ");
				name[cnt] = sc.next();
				System.out.print("아이디 입력 : ");
				id[cnt] = sc.next();
				System.out.print("비밀번호 입력 : ");
				pw[cnt] = sc.next();
				System.out.print("계좌번호 입력 : ");
				account[cnt] = sc.next();

				cnt++;

			} else if (menu == 2) {

				System.out.println("-----로그인-----");
				System.out.print("아이디 : ");
				String loginId = sc.next();
				System.out.print("비밀번호 : ");
				String loginPw = sc.next();

				for (int i = 0; i < cnt; i++) {

					if (id[i].equals(loginId)) {
						if (pw[i].equals(loginPw)) {
							System.out.println(name[i] + "님 로그인 성공!");
							break;
						} else {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}

					}
					if (!id[i].equals(loginId)) {
						System.out.println("없는 아이디입니다.");
						break;
					}

				}

			} else if (menu == 3) {
				System.out.println("-----회원목록-----");
				System.out.println("이름\t아이디\t비밀번호\t계좌번호\t입금금액");
				System.out.println("========================================");

				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\t%d\n", name[i], id[i], pw[i], account[i], balance[i]);
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("0~3까지 입력가능");
			}

		}
		System.out.println();
	}

}
