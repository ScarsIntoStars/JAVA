package day08;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int balance = 10000;

		while (true) {
			System.out.printf("=====자판기=====[%d]원\n", balance);
			System.out.println("1.콜라(1000)\n2.사이다(1200)\n3.우유(1500)\n0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) { // 콜라 선택
				System.out.println("콜라를 선택하셨습니다.");

				if (balance >= 1000) {
					System.out.println("콜라 주문 완료!");
					balance -= 1000;
				} else {
					System.out.println("잔액이 부족합니다.");
					System.out.println("콜라 주문 실패!");
				}

			} else if (menu == 2) { // 사이다 선택
				System.out.println("사이다를 선택하셨습니다.");

				if (balance >= 1200) {
					System.out.println("사이다 주문 완료!");
					balance -= 1200;
				} else {
					System.out.println("잔액이 부족합니다.");
					System.out.println("사이다 주문 실패!");
				}

			} else if (menu == 3) { // 우유 선택
				System.out.println("우유를 선택하셨습니다.");

				if (balance >= 1500) {
					System.out.println("우유 주문 완료!");
					balance -= 1500;
				} else {
					System.out.println("잔액이 부족합니다.");
					System.out.println("우유 주문 실패!");
				}

			} else if (menu == 0) { // 종료
				break;
			} else {
				System.out.println("0~3까지의 숫자만 입력가능합니다.");
			}
			System.out.println();

		}

	}

}
