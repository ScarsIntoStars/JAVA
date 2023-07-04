package day03;

import java.util.Scanner;

public class 메모장 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====계산기=====");

			System.out.println("첫번 째 숫자입력> ");
			int num1 = sc.nextInt();

			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지 6.종료");
			int menu = sc.nextInt();

			System.out.print("두번 째 숫자입력> ");
			int num2 = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.printf("%d + %d = %d\n, num1, num2, (num1+num2)");
				break;
			case 2:
				System.out.printf("%d - %d = %d\n, num1, num2, (num1-num2)");
				break;
			case 3:
				System.out.printf("%d * %d = %d\n, num1, num2, (num1*num2)");
				break;
			case 4:
				System.out.printf("%d + %d = %d\n, num1, num2, (num1+num2)");
				break;
			case 5:
				System.out.printf("%d + %d = %d\n, num1, num2, (num1+num2)");
				break;

			}

		}

	}

}
