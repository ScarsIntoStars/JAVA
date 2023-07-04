package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
	// 객체란 무엇인가?
	// 하나의 유저 = 하나의 객체

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		List<User> list = new ArrayList<User>();

		while (true) {
			System.out.println("회원가입시스템");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				User user = new User(); // 클래스는 무조건 첫 자 대문자
				System.out.print("이름 : ");
				user.setName(sc.next());
				System.out.print("아이디 : ");
				user.setName(sc.next());
				System.out.print("비밀번호 : ");
				user.setName(sc.next());
				list.add(user);
				System.out.println(user.getName() + "님 회원가입을 축하합니다.");
			} else if (menu == 2) {
				System.out.print("로그인 할 아이디 : ");
				String loginId = sc.next();
				System.out.print("로그인 할 비밀번호 : ");
				String loginPw = sc.next();
				boolean find = false;

				// 로그인 구현하기
				for (int i = 0; i < list.size(); i++) {
					// list에는 user의 정보가 들어있음
					if (loginId.equals(list.get(i).getId()) && loginPw.equals(list.get(i).getPw())) {
						; // 여기서의 get은 : list[50] == list(50)
						System.out.println("로그인 성공!");
						
						break;
					}
				}
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("==========================");

				for (int i = 0; i < list.size(); i++) {
					list.get(i).print();
				}

			} else if (menu == 0) {

			} else {

			}

		}

	}

}
