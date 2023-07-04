package day07;

import java.util.Scanner;

public class 복습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.콜라 2.사이다 3.우유 0.종료");
		// 문제1) while문을 사용하여 반복하면서
		// 1번을 누르면 콜라선택
		// 2번을 누르면 사이다선택
		// 3번을 누르면 우유선택
		// 0번을 누르면 반복문 종료

		// 문제2) 잔액추가하기
		// 1번을 누르면 1000원 차감
		// 2번을 누르면 1200원 차감
		// 3번을 누르면 1500원 차감
		// 0번을 누르면 반복문 종료

		// 문제3) 잔액부족 출력하기

		Scanner sc = new Scanner(System.in);
		int money = 10000;
		String[] product = new String[100];
		// product[0] = "우유";
		int cnt = 0;
		int cokeSum = 0;
		int siderSum = 0;
		int milkSum =0;
		
		
		while (true) {

			System.out.println("=====자판기===== 남은 금액 : " + money);
			System.out.println("1.콜라(1000) \n2.사이다(1200) \n3.우유(1500) \n4.구매목록 \n0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (money >= 1000) {
					System.out.println("콜라를 선택하셨습니다.");
					money -= 1000;
					product[cnt++] = "콜라";
					cokeSum++;
					// product[cnt] cnt ++ 을 줄여서 product[cnt++]로 줄일 수 있음(후치증가)
					// product[++cnt]는 1을 추가시킨 후 대입
				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu == 2) {
				if (money >= 1200) {
					System.out.println("사이다를 선택하셨습니다.");
					money -= 1200;
					product[cnt++] = "사이다";
					siderSum++;
					;

				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu == 3) {
				if (money >= 1500) {
					System.out.println("우유를 선택하셨습니다.");
					money -= 1500;
					product[cnt++] = "우유";
					milkSum++;

				} else {
					System.out.println("잔액이 부족합니다.");
				}

			} else if (menu == 4) {
				System.out.println("구매목록\t수량");
				System.out.println("=====");
				// 구매목록 출력
//				for (int i = 0; i < cnt; i++) {
				
//				} 
				
//				}
				
				
				
//				System.out.println("콜라 판매 갯수 : " + cokeSum);
//				System.out.println("사이다 판매 갯수 : " + siderSum);
//				System.out.println("우유 판매 갯수 : " + milkSum);

			} else if (menu == 0) {
				System.out.println("자판기를 종료합니다.");
				break;

			} else {
				System.out.println("0~3까지 입력");
			}
			System.out.println();
		}

	}

}
