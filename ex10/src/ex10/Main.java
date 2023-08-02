package ex10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean run = true;
		Scanner s = new Scanner(System.in);
		while (run) {
			System.out.println("\n\n******* 메인메뉴 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생관리 |2.강좌관리 |3.수강신청관리 |0.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			case "1":
				Student.run();
				break;
				
			case "2":
				Course.run();
				break;
				
			case "3":
				Enrol.run();
				break;
				
				
				
				
			default:
				System.out.println("메뉴를 다시 선택하시오.");
			} // 스위치

		} // 와일
	} // 매인 매서드

} // 매인클래스
