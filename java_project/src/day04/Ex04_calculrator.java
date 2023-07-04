package day04;

import java.util.Scanner;

public class Ex04_calculrator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("=====계산기=====");

			while (true) {
				System.out.print("첫번쨰 숫자입력> ");
				int num1 = sc.nextInt();
				String cal = sc.next();
				while (true) {
					System.out.print("연산자 선택> ");
					cal = sc.next();

					if (cal.equals("+") || cal.equals("-") || cal.equals("*") || cal.equals("/") || cal.equals("%")) {
						break;
					} else {
						System.out.println("사용할 수 없는 연산자입니다.");
					}
				}

				System.out.print("두번째 숫자입력> ");
				int num2 = sc.nextInt();

				if (cal.equals("+")) {
					System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				} else if (cal.equals("-")) {
					System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				} else if (cal.equals("*")) {
					System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
				} else if (cal.equals("/")) {
					System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
				} else if (cal.equals("%")) {
					System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
				} else {
					System.out.println("+ - * / % 중 하나를 입력하시오");
				}
				System.out.println();
			}
		}
	}

}
