package ex01;

import java.util.Scanner;

public class Repeat {

	public static void run() {
		// 반복문 (while, for)
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("1) 100까지의 합 | 2) 100까지의 짝수 합 | 3) 100까지의 홀수 합 | 0) 종료");
			System.out.println("-----------------------------------------------------------------");
			System.out.print("선택 : ");
			String menu = sc.nextLine(); // 공백이 생기면 다음 줄로 넘김
			int tot = 0;

			switch (menu) {
			case "0":
				System.out.println("프로그램이 종료됩니다!");
				run = false;
				break;
			case "1":
				for (int i = 0; i <= 100; i++) {
					tot = tot + i; // tot += i;
				}
				System.out.println("1부터 100까지의 합 : " + tot);
				break;
			case "2":
				for (int i = 2; i <= 100; i += 2) {
					tot += i;
				}
				System.out.println("1부터 100까지 짝수의 합 : " + tot);
				break;
			case "3":
				for (int i = 1; i <= 100; i += 2) {
					tot += i;
				}
				System.out.println("1부터 100까지 홀수의 합 : " + tot);
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!");

			}

		}
	}

}
