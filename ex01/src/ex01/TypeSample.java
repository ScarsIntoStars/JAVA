package ex01;

public class TypeSample {

	public static void run() { // static이 붙으면 객체를 만들지 않고 사용가능
		// 숫자 변수타입
		int num1 = 80; // '='은 대입이다. 80이라는 정수 정보를 num1에 저장함
		// 실수형 변수는 플롯과 더블. 플롯은 4바이트, 더블은 8바이트
		float num2 = 80.5f; // 실수값 뒤에 f를 넣어야 됨
		double num3 = 80.5;

		// 문자 변수타입
		char str1 = 'A'; // 작은 따옴표
		String str2 = "ABCD"; // 첫 글자 대문자

		// 불린 (true와 false만 저장 가능)
		boolean isEnd = true; // 변수에도 의미를 주자 카멜등 표기법

		System.out.print("num1 = " + num1 + "\n\n"); // \n은 줄 바꿈(line skip)
		System.out.println("num2 = " + num2);
	}

}
