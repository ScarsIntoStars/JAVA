package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<User2> list = new ArrayList<User2>();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("=====맴버쉽=====");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			int menu = sc.nextInt();

			if (menu == 1) { // 회원가입
			System.out.println("이름 입력");
			String name = sc.next();
			
			
			
			} else if (menu == 2) {
				System.out.print("-----로그인-----");
				System.out.println("아이디입력 : ");
				String loginId = sc.next();
				
				
				
			} else if (menu == 3) {

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}

//System.out.print("이름 입력 : ");
//String myName = sc.next();
//System.out.print("아이디 입력 : ");
//String myId = sc.next();
//System.out.println("비밀번호 입력 : ");
//String myPw = sc.next();
//
//User2 m = new User2(myName, myId, myPw);
//list.add(m);