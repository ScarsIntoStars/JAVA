package day02;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문의 조건문만 있음
//		int a = 9;
//		while(a < 10) { // 무한반복
//			System.out.println("반복");
//		}
//		while(true) {
//			System.out.println("반복");
//		}

//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		while(true) { // 조건이 true이기 때문에 break를 만나서 나와야 한다.
//			System.out.print("숫자입력> ");
//			int num = sc.nextInt();
//			if(num == 0) {
//				break;
//			}
//		}
//		System.out.println("반복종료");

		// 반복해서 숫자를 입력받아 출력
		// 3의 배수는 피즈
		// 5의 배수는 버즈
		// 3과 5의 배수는 피즈버즈
		// 0이 입력되면 반복종료

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();

			if (num == 0) {
				break;
			} else if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("피즈버즈");
			} else if (num % 3 == 0) {
				System.out.println("피즈");
			} else if (num % 5 == 0) {
				System.out.println("버즈");
			} else {
				System.out.println(num);
			}
		}
		System.out.println("반복종료");

	}

}
