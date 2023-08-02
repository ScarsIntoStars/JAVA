package ex30;

import java.util.*;
import java.sql.*;

public class Student {
	public static void run() {
		Scanner s = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("\n\n******* 학생관리 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생목록 |2.학생조회 |3.학생등록 |0.메인메뉴");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("메인메뉴로 돌아갑니다.");

				break;
			}
		}
	}
}