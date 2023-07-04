package day07;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		String id = "test";
//		String pw = "1234";
//		
//		// 아이디가 틀렸습니다.
//		// 비밀번호가 틀렸습니다.
//		// 로그인 성공
//		
//		while(true) {
//			System.out.print("아이디 입력 : ");
//			String loginId = sc.next();
//			System.out.print("비밀번호 입력 : ");
//			String loginPw = sc.next();
//			
//			if(loginId.equals(id) && loginPw.equals(pw)) {
//				System.out.println("로그인 성공!");
//				break;
//			} else if(loginId.equals(id) && !loginPw.equals(pw)) {
//				System.out.println("비밀번호가 틀렸습니다");
//			} else if(!loginId.equals(id) && loginPw.equals(pw)) {
//				System.out.println("아이디가 틀렸습니다.");
//			}

//		// 1부터 입력받은 수 까지의 합
//		System.out.print("입력할 수 :");
//		int num = sc.nextInt();
//		int sum = 0;
//
//		for (int i = 0; i <= num; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

//		// 구구단 출력
//		System.out.print("단 입력 : ");
//		int dan = sc.nextInt();
//
//		for (int i = 0; i <= 19; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}

		// 1~100까지
		// 3의 배수 : 피즈
		// 5의 배수 : 버즈
		// 3과 5의 배수 : 피즈버즈
		// 나머지 숫자는 그냥 출력

		for (int i = 0; i <= 100; i++) {
			if (i == 0) {
				System.out.println("0");
			} else if (i % 15 == 0) {
				System.out.println("피즈버즈");
			} else if (i % 3 == 0) {
				System.out.println("피즈");
			} else if (i % 5 == 0) {
				System.out.println("버즈");
			} else {
				System.out.println(i);
			}

		}

	}

}
