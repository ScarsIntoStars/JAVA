package ex01;

import java.util.Scanner;

public class Dimention {

	public static void run() {
		String[] names = new String[22];
		String[] addresses = new String[22]; // 0번부터 21번 방 까지 생성

		Scanner s = new Scanner(System.in);
		boolean run = true;
		int index = 0;

		while (run) {
			System.out.println("---------------------------------");
			System.out.println("1. 주소등록\n2. 주소목록\n3. 종료");
			System.out.println("---------------------------------");
			System.out.print("선택 : ");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다");
				break;
			case "1":
				System.out.print("이름 > ");
				String name = s.nextLine();
				names[index] = name;
				System.out.print("주소 > ");
				String adress = s.nextLine();
				addresses[index] = adress;
				index++;
				System.out.println(index + "명 입력완료!");
				break;
			case "2":
				for (int i = 0; i < index; i++) {
					System.out.printf("%d\t%s\t%s\n", i + 1, names[i], addresses[i]);
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택해주세요");
			}
			System.out.println();
		}
	}
}
