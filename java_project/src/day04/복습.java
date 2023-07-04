package day04;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력> ");
		int num = sc.nextInt();

		// 입력받은 수가 0이 아닌 짝수, 홀수, 0 출력
		if (num == 0) {
			System.out.println("0");
		} else if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// 입력받은 수가 3의 배수, 7의 배수, 3과 7의 배수, 둘 다 아님 출력
		if (num % 3 == 0 && num % 7 == 0) {
			System.out.println("3과 7의 배수");
		} else if (num % 3 == 0) {
			System.out.println("3의 배수");
		} else if (num % 7 == 0) {
			System.out.println("7의 배수");
		} else {
			System.out.println("둘 다 아님");
		}

	}

}
