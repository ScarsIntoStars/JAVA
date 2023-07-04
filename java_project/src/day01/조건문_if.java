package day01;

import java.util.Scanner;

public class 조건문_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 19 이상 성인
		// 13 이상 청소년
		// 8 이상 초등학생
		// 7 이하 어린이
//		int age = 15;
//		if(age >= 19) { // (age가 19보다 크거나 같으면) {실행}
//			System.out.println("성인입니다.");
//		} else if(age >= 13) { // (age가 13보다 크거나 같으면)
//			System.out.println("청소년입니다.");
//		} else if(age >=8) { // 위 조건이 다 아니면 else (조건이 없음)
//			System.out.println("초등학생입니다.");
//		} else {
//		System.out.println("어린이입니다.");
//		}
//	}
		// 변수 a의 값에 따라 "양수", "음수", "0"을 출력하시오
//		int a = 22;
//		if(a > 0) {
//			System.out.println("양수입니다.");
//		} else if(a < 0) {
//			System.out.println("음수입니다.");
////		 else if(a == 0) {
//// 		} System.out.println("0입니다.");
//		} else {
//		System.out.println("0입니다.");
//		}
		
		// 변수 score의 값에 따라
		// 90이상 A
		// 80이상 B
		// 70이상 C
		// 60이상 D
		// 60미만 F
//		int score = 42;
//		
//		if(score >= 90) {
//			if(score >= 95) { // 중첩if문 (if 안에 if)
//				System.out.println("A+");
//			} else {
//				System.out.println("A");
//			}
//		} else if(score >= 80) {
//			if(score >= 85) {
//				System.out.println("B+");
//			} else {
//				System.out.println("B");
//			}
//		} else if(score >= 70) {
//			if(score >= 75) {
//				System.out.println("C+");
//			} else {
//				System.out.println("C");
//			}
//		} else if(score >= 60) {
//			if(score >= 65) {
//				System.out.println("D+");
//			} else {
//				System.out.println("D");
//			}
//		} else {
//			System.out.println("F");
//		}
	
		// 콘솔에서 입력받고 싶을 때 사용
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> "); // ln은 줄바꿈
//		int a = sc.nextInt();
//		System.out.println(a);
//		
//		if(a > 0) {
//			System.out.println("양수입니다.");
//		} else if (a < 0) {
//			System.out.println("음수읍니다.");
//		} else {
//			System.out.println("0입니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이입력> ");
//		int age = sc.nextInt();
//		
//		if(age >= 19) {
//			System.out.println("성인입니다");
//		} else if(age >=13) {
//			System.out.println("청소년입니다");
//		} else if(age >=8) {
//			System.out.println("초등학생입니다");
//		} else {
//			System.out.println("어린이입니다.");
//		}
		
		// 변수 num의 값에 따라 짝수, 홀수, 0 출력
		// 입력예시) 숫자입력> 5
		// 출력예시) 홀수입니다.
//		Scanner sc = new Scanner(System.in); // 외우는 문장
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		
//		if(num == 0) { // 0을 먼저 줘야 짝수에서 안걸림
//			System.out.println("0");
//		} else if(num % 2 != 0) {
//			System.out.println("홀수");
//		} else if(num % 2 == 0) // 조건을 안줘도 됨
//			System.out.println("짝수");
		
		// 변수 num의 값에 따라 3의 배수, 5의 배수, 3과 5의 배수, 둘 다 아님을 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 입력> ");
//		int num = sc.nextInt();
//		
//		
//		if(num % 3 == 0 && num % 5 == 0 ) {
//			System.out.println("3과 5의 배수");
//		} else if (num % 5 == 0) {
//			System.out.println("5의 배수");
//		} else if (num % 3 == 0) {
//			System.out.println("3의 배수");
//		} else {
//			System.out.println("둘 다 아님");
//		}
			
		// 가장 큰 수 출력
		int a = 10;
		int b = 12;
		int c = 15;
		
		if(a > b) {
			if(a > c) {
				System.out.println("a가 가장 크다.");
			} else {
				System.out.println("c가 가장 크다.");
			}
		
		} else if(a > c) {
			if(a > b) {
				System.out.println("a가 가장 크다.");
			} else {
				System.out.println("b가 가장 크다.");
			}			
		
		} else {
			System.out.println("b가 가장 크다.");
		}
		
	}
}
	
