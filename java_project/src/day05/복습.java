package day05;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 하나의 문자를 입력받아
		// 3의 배수, 5의 배수, 3과 5의 배수, 둘 다 아님을 출력

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();

//		if (num == 0) {
//			System.out.println("0입니다");
//		} else if (num % 3 == 0 && num % 5 == 0) {
//			System.out.println("3과 5의 배수");
//		} else if (num % 3 == 0) {
//			System.out.println("3의 배수");
//		} else if (num % 5 == 0) {
//			System.out.println("5의 배수");
//		} else {
//			System.out.println("둘 다 아님");
//		}

		// 하나의 숫자를 입력받아
		// 1~입력받은 수 까지의 합 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");
		int num = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
