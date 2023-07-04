package day08;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//
//		// 두 개의 수를 입력받아
//		// 더하기, 뺴기, 곱하기, 나누기, 나머지 구하기
//
//		System.out.print("첫 번째 수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
//		System.out.print("메뉴선택 : ");
//		int menu = sc.nextInt();
//		System.out.print("두 번째 수 입력 : ");
//		int num2 = sc.nextInt();
//
//		if (menu == 1) {
//			System.out.println("-----더하기-----");
//			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		} else if (menu == 2) {
//			System.out.println("-----빼기-----");
//			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		} else if (menu == 3) {
//			System.out.println("-----곱하기-----");
//			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		} else if (menu == 4) {
//			System.out.println("-----나누기-----");
//			System.out.println(num1 + " / " + num2 + " = " + (num1 / (double)num2)); // 더블을 써야 소수점이 생김
//		} else if (menu == 5) {
//			System.out.println("-----나머지-----");
//			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		} else {
//			System.out.println("1~5까지만 입력하시오.");
//		}
//		System.out.println();

		// 1부터 100까지 3의 배수 갯수 출력
		// 1부터 100까지 3의배수, 5의배수, 3과 5의 배수 갯수 출력
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += 1;
			}
		}
		System.out.println(sum + "개");

		int sum15 = 0;
		int sum3 = 0;
		int sum5 = 0;

		for (int j = 0; j <= 100; j++) {
			if (j % 15 == 0) {
				sum15++;
			}
			if (j % 3 == 0) {
				sum3++;
			}
			if (j % 5 == 0) {
				sum5++;
			}
		}
		System.out.println("3 배수의 갯수 : " + sum3);
		System.out.println("5 배수의 갯수 : " + sum5);
		System.out.println("3과 5의 공배수 갯수 : " + sum15);

	}

}
