package day02;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		// 숫자를 입력받고, 양수, 음수, 0 출력하시오
//		Scanner sc = new Scanner(System.in); // 'Scan' 입력 후 Ctrl+Space => 인포트(JAVA의 다른 클레스에 있는 것을 가져오는 것, 콘솔에서 입력받고 싶을 때 사용
//		// sc는 변수명
//		System.out.print("숫자입력> "); // =는 우측의 자료를 좌측에 넣는 것
//		
//		int a = sc.nextInt(); // int는 정수자료형, a에 입력받은 값을 넣는 것
//		
//		if(a > 0) { // 세 개 중 하나만 실행됨 (하나의 if문 안에 들어있기 때문)
//			System.out.println("양수입니다.");
//		} else if(a < 0) {
//			System.out.println("음수입니다.");
//		} else {
//			System.out.println("0입니다.");
//		}
		
		// score 90이상 A
		//		 80이상 B
		//		 70이상 C
		// 	 	 60이상 D
		// 	 	 60미만 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수입력> ");
//		int score = sc.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else if(score >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
		
		// if는 어렵지 않다. 조건을 만드는 것이 어렵다.
		// int는 정수를 넣어야 되기 때문에 소숫점이 있으면 오류가 남
		
		
		// 아래 if문에서 90을 넣으면 A B C 세 개가 나온다.
//		if(score >= 90) {
//			System.out.println("A");
//		}
//		if(score >= 80) {
//			System.out.println("B");
//		}
//		if(score >= 70) {
//			System.out.println("C");
//		}
//		
		
		// 숫자 하나를 입력받고 0이 아닌 짝수, 홀수, 0
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		
//		if(num == 0) {
//			System.out.println("0");
//		} else if(num % 2 == 0) { 
//			System.out.println("짝수");
//		} else if(num % 2 == 1) { // (num % 2 == 1)
//			System.out.println("홀수");
//		}
		
		
		// 숫자를 하나 입력받아 3의 배수, 5의 배수, 3과 5의 배수, 둘 다 아님 출력
		// 출력예시) 숫자입력> 15 => 3과 5의 배수
		// 출력예시) 숫자입력> 20 => 5의 배수
		// 출력예시) 숫자입력> 7 => 둘 다 아님
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자입력> ");
//		int num = sc.nextInt();
//		
//		if(num % 3 == 0 && num % 5 == 0) { // (num % 15 == 0) 이것도 방법
//			System.out.println("3과 5의 배수");
//		} else if(num % 3 == 0) {
//			System.out.println("3의 배수");
//		} else if(num % 5 == 0) {
//			System.out.println("5의 배수");
//		} else {
//			System.out.println("둘 다 아님");
//		}
	
		
		// 계산기 프로그램
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자입력> ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 숫자입력> ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.니머지");
//		System.out.print("메뉴선택> ");
//		int menu = sc.nextInt();
//		
//		if(menu == 1) {
//			System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
//		} else if(menu == 2) {
//			System.err.println(num1 + "-" + num2 + "=" + (num1-num2));
//		} else if(menu == 3) {
//			System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
//		} else if(menu == 4) {
//			System.out.println(num1 + "/" + num2 + "=" + (num1/(double)num2)); // 형변환
//		} else if(menu == 5) {
//			System.out.println(num1 + "%" + num2 + "=" + (num1%num2));
//		} else {
//			System.out.println("1~5까지 입력해주세요");
//		}
//		
		
		
		// 로그인 프로그램
		String id = "aa";
		String pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력> ");
		String loginId = sc.next();
		System.out.print("비밀번호 입력> ");
		String loginPw = sc.next();
		
		// 카넬표기법 : 두 단어가 합쳐진 변수는 연결되는 첫 글자를 대문자로 표기
		
		// 로그인 성공, 로그인 실패
//		if(loginId.equals(id) && loginPw.equals(pw)) { 
//			// String을 비교할 땐 equals로 한다., 기본자료형 (==), 참료자료형(equals())
//			System.out.println("로그인 성공");
//		} else {
//			System.out.println("로그인 실패");
//		}
//		
		
		// login == id => login.equals(id)
		// login != id => !login.equals(id) // !! => !(!asdf)
		
		// 아이디가 틀렸습니다, 비밀번호가 틀려습니다, 로그인 성공
//		if(loginId.equals(id) && loginPw.equals(pw)) {
//			System.out.println("로그인 성공");
//		} else if(!loginId.equals(id)) {
//			System.out.println("아이디가 틀렸습니다.");
//		} else if(!loginPw.equals(pw)) {
//			System.out.println("비밀번호가 틀렸습니다.");
//		} else { // 굳이 필요가 없음
//			System.out.println("로그인 실패"); 
//		}
		
		if(loginId.equals(id)) {
			if(loginPw.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
		
		
		
		
		
		
		
	}

}







