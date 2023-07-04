package day06;

import java.util.Scanner;

public class 다시하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		int cnt = 0;

		while (true) {
			System.out.println();
			System.out.println("1. 회원가입 \n2. 로그인 \n3. 회원목록 \n0. 종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) { // 회원가입
				System.out.println("-----회원가입-----");
				System.out.print("사용할 이름 : ");
				name[cnt] = sc.next();
				System.out.print("사용할 아이디 : ");
				id[cnt] = sc.next();
				System.out.print("사용할 비밀번호 : ");
				pw[cnt] = sc.next();

				cnt++;

			} else if (menu == 2) { // 로그인

				System.out.print("아이디 입력 : ");
				String loginId = sc.next();
				System.out.print("비밀번호 입력 : ");
				String loginPw = sc.next();
				boolean find = false;
				
				for (int i = 0; i < cnt; i++) {
					if (loginId.equals(id[i])) {
						if (loginPw.equals(pw[i])) {
							System.out.println("로그인 성공");
							find = true;
						} else {
							System.out.println("비밀번호가 틀립니다.");
							find = true;
						}

					}
					if (!find) {
						System.out.println("없는 아이디입니다.");

					}

				}

			} else if (menu == 3) { // 회원목록
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("========================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s \t %s \t %s\n", name[i], id[i], pw[i]);
				}

			} else if (menu == 0) { // 종료
				System.out.println("로그인 종료");
				break;
			} else { // 잘못입력함
				System.out.println("0~2까지 입력하시오");
			}
			System.out.println();
		}

	}

}
