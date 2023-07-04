package day09;

public class Calculator {
	// 필드 (인스턴스 변수)
	int num1; //
	int num2; //

	// 매서드
	// 매서드 명 : sum, 리턴타입 x, 매개변수 x, 실행문구 : 필드 num1+num2 출력
	public void sum() {
		System.out.println(num1 + num2);
	}

	// 매서드 명 : sub, 리턴타입 x, 매개변수 : 정수 두 개, 실행문구 : 매개변수로 받은 두 값의 차
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	// 매서드명 : mul, 리턴타입 o, 매개변수 x, 실행문구 : num1*num2 출력
	public int mul() {
		return num1 * num2;
	}

	// 매서드명 : div, 리턴타입 o, 매개변수 : 정수 두 개, 실행문구 : 매개변수로 받은 두 값의 나눈 후 리턴
	public double div(int a, int b) {
		return a / (double) b; // int와 int를 나누는데 double로 자동형변환 됨
	}
}
