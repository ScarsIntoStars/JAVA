package day03;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int i=0; i<5; i++) {
//			System.out.println("안녕하세요");
//		}

//		// 2씩 증가 2 4 6 8 10
//		for(int i=1; i<=10; i=i+2) {
//			System.out.println(i);
//		}
//		
//		// 1씩 증가 1 2 3 4 5 6 7 8 9 10
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		
//		// 10~1까지 출력 10 9 8 7 6 5 4 3 2 1
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
//
//		// 1~10 가로로 출력
//		for (int i = 1; i <= 10; i++) {
//			if (i == 10) {
//				System.out.print(i);
//			} else {
//				System.out.print(i + ", ");
//			}
//
//		}
//
//		// 1~10 합 출력
//		int sum = 0; // 누적시킬 변수
//		for(int i=1; i<=10; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//
//		// 1~100 7의 배수 갯수 출력
//		int cnt = 0;
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 7 == 0) { // i를 7로 나눴을 때 0이면
//				cnt++;		  // cnt를 증가시킴
//			}
//		}
//		System.out.println("1~1000 7의 배수 갯수는 : " + cnt +"개");
//
//		// 구구단 출력 break(반복문 중지), continue(반복문 생략)
//		int dan = 6;
//		System.out.println(dan+"단");
//		for (int i = 1; i <= 9; i++) {
//			if(i == 5) {
//				System.out.println();
//				continue;
//			}
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
//		System.out.println(dan + "단 끝");

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int a = sc.nextInt();

//		if (a > 0) {
//			System.out.println("양수");
//		}
//
//		while (a > 0) {
//			System.out.println("양수");
//		}

//		while (true) {
//			System.out.print("숫자입력> ");
//			int a = sc.nextInt();
//			if (a > 0) {
//				System.out.println("양수");
//			} else if (a < 0) {
//				System.out.println("음수");
//			} else if (a == 0) {
//				break;
//			}
//		}
		// 위에 break가 없을 경우에는
		// System.out.println("반복문 종료");
		// while문이 안끝나서 실행못함 그래서 빨간표시

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");

		while (true) {
			int a = sc.nextInt();
			if (a == 0) {
				break;
			}
			if (a % 2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		}
		System.out.println("반복문 종료");

	}

}
