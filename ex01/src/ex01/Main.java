package ex01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 타입\n2. 연산자\n3. 조건문\n4. 배열\n5. 주소관리\n0. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 : ");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램이 완전 종료됩니다.");

			case "1":
				TypeSample.run();
				break;

			case "2":
//		Dimention.run();
				break;

			case "3":
				Operation.run();
				break;

			case "4":
				Address1.run();

			}
		}
	}
}

//		TypeSample type = new TypeSample(); // 기본생성자 , type는 class변수
//		type.run();
//		type.run();

//		TypeSample.run(); // 클래스에 static이 붙어서 객체를 안만들고 사용가능

//		Operation.run();

//		Condition.run();

//		Repeat.run();

//		Address.run();

//		Address1.run();
