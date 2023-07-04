package day04;

import java.util.Scanner;

public class Ex01_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 10000;
		
		while (run) {
			System.out.printf("=====자판기=====[%,d원]\n", balance); // %d 자리에 ㅠ미뭋ㄷ
			// printf에서는 자동줄바꿈이 안됨 그래서 \n으로 수동줄바꿈
			System.out.println("1.콜라(1000)\n2.사이다(1200)\n3.우유(1500)\n4.충전\n0.종료");
			System.out.print("메뉴선택>\t ");
			int menu = sc.nextInt();

			// 콜라선택 or 사이다선택 or 우유선택 or 반복문종료

			if (menu == 1) {
				System.out.println("콜라선택");
				if (balance >= 1000) {
					balance = balance - 1000;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 2) {
				System.out.println("사이다선택");
				if (balance >= 1200) {
					balance = balance - 1200;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 3) {
				System.out.println("우유선택");
				if (balance >= 1500) {
					balance = balance - 1500;
				} else {
					System.out.println("잔액이 부족합니다.");
				}
			} else if (menu == 4) {
				System.out.print("충전할 금액> ");
				int inMoney = sc.nextInt();
				balance = balance + inMoney; // balance =+ = inMoney;
			} else if (menu == 0) {
//				break;
				run = false;
			} else {
				System.out.println("0~3 입력가능");
			}
			System.out.println();
		}
		System.out.println("반복문 종료");
	}

}
