package day06;

import java.util.Scanner;

public class 복습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 아이디와 비밀번호를 입력받아(아이디가 틀렸습니다, 비밀번호가 틀렸습니다, 로그인 성공) 출력
//		Scanner sc = new Scanner(System.in);
//		String id = "asdf";
//		String pw = "1234";
//
//		
//			System.out.print("아이디 입력> ");
//			String loginId = sc.next();
//			System.out.print("비밀번호 입력> ");
//			String loginPw = sc.next();
//
//			if (id.equals(loginId) && pw.equals(loginPw)) { //
//				System.out.println("로그인 성공!");
//				// id.equals(loginIn)과 (idlogIn.equals(id)는 같다.
//			} else if (!(id.equals(loginId)) && pw.equals(loginPw))  {
//				System.out.println("아이디가 틀렸습니다.");
//
//			} else if (!(pw.equals(loginPw))) {
//				System.out.println("비밀번호가 틀렸습니다.");
//
//			} 

		// 1~100까지의 합 출력

//		int sum = 0;
//
//		for (int i = 0; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

		// 구구단 출력
		// dan 변수를 사용하여, 19단지 출력
		int dan = 5;

		for (int i = 1; i <= 19; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}

	}
}
