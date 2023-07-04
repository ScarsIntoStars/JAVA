package day03;

import java.util.Scanner;

public class Ex02_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String id = "test"; // 회원가입 한 아이디
		String pw = "1234"; // 회원가입 한 비밀번호

		while (true) { // while의 반복조건은 true를 많이 사용한다
			System.out.println("=====로그인=====");
			System.out.print("아이디 입력> ");
			String loginId = sc.next(); // loginId는 콘솔로 받은 값
			System.out.print("비밀번호 입력> ");
			String loginPw = sc.next(); // loginPw는 콘솔로 받은 값

			if (id.equals(loginId) && pw.equals(loginPw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				System.out.print("로그인 재시도(Y/y> "); // Y, y 둘 중 하나만 누르면 재로그인으로
				String tryLogin = sc.next();

				// 결국 어차피 반복되기 때문에 다르게 해보자
//				if (tryLogin.equals("y") || tryLogin.equals("Y")) {
//					// tryLogin == "Y" || tryLoing == "y"
//					// String은 equals를 사용함
//				} else {
//					break;
//				

				// y나 Y가 눌리지 않으면 break
//				if (!(tryLogin.equals("y") || tryLogin.equals("Y"))) {
//					break;

				// 이것도 방법인데, 생각을 하야 됨
				if (!tryLogin.equals("y") || !tryLogin.equals("Y")) {
					break;

				}

			}
			System.out.println();
		}
		System.out.println("로그인 프로그램 종료");
	}

}
