package day06;

import java.util.Scanner;

public class 빡대가리ㅠㅠ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		Scanner sc = new Scanner(System.in);

		System.out.println("=====네이버======");
		System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
		System.out.print("메뉴 : ");
		int menu = sc.nextInt();
		int cnt = 0;
		while (true) {
			boolean run = false;

			if (menu == 1) {
				System.out.println("----회원가입----");
				System.out.print("이름 : ");
				name[cnt] = sc.next();
				System.out.print("사용할 아이디 : ");
				id[cnt] = sc.next();
				System.out.print("사용할 비밀번호 : ");
				pw[cnt] = sc.next();

			} else if (menu == 2) {
				System.out.print("아이디 입력 : ");
				String loginId = sc.next();

				System.out.print("비밀번호 입력 : ");
				String loginPw = sc.next();

				for (int i = 0; i <= cnt; i++) {

					if (loginId.equals(id[i])) {
						System.out.println("로그인 성공!!");
						run = true;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
						run = true;
					}
				}
				while (run) {
					if (!loginId.equals(id)) {
						System.out.println("아이디가 틀렸습니다.");
					}
				}

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else {
				System.out.println("0~3까지만 입력가능");
			}
		}
	}

}
