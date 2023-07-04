package day04;

import java.util.Scanner;

public class 나머지공부01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";
		String pw = "";
		boolean login = false;

		while (true) {
			System.out.println("=====회원가입=====");

			while (true) {
				if (login) {
					System.out.println("1.로그인 정보 2.로그아웃 0.종료");
				} else {
					System.out.println("1.회원가입 2.로그인 0.종료");
				}
				int menu = sc.nextInt();

				
				if (menu == 1) { // 회원가입
					if (login) {
					System.out.print("이름 입력> ");
					name = sc.next();
					System.out.print("아이디 입력> ");
					id = sc.next();
					System.out.print("비밀번호 입력> ");
					pw = sc.next();
				} else {
					System.out.println("아이디 : " + name);
					System.out.println("비밀번호 : " + pw);
					
					
					
				}
					

				} else if (menu == 2) { // 로그인
					System.out.print("아이디 : ");
					String loginId = sc.next();
					System.out.println("비밀번호 : ");
					String loginPw = sc.next();
					

					if (loginId.equals(id) && loginPw.equals(pw)) {
						System.out.println("로그인 성공!");
						login = true;
					} else {
						System.out.println("로그인 실패");
					}

				} else if (menu == 0) {
					System.out.println("로그인 종료");
					break;
				}
			}
		}

	}
}