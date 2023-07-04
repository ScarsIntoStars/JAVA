package day10;

public class Calculator {

	// 필드(인스턴스 변수)
	int num1;
	int num2;

	// 생성자

	// [매서드 형식]
	// 접근제한자, 리턴타입, 매서드명([매개변수]) {
	// 실행문구
	// }

	// 매서드
	// 매서드명 sum, 리턴타입x, 매개변수x, 실행문구:필드num1+num2 출력

	// void도 String이나 int처럼 하나의 타입임
	// 리턴 할 게 없으면 void

	public void setSum() {
		System.out.println(num1 + num2);
	}

	// 매서드명 sub, 리턴타입x, 매개변수:정수 두 개, 실행문구: 매개변수로 받은 두 개의 값의 차 출력
	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	// 매서드명 mul, 리턴타입o, 매개변수x, 실행문구: 필드num1*num2
	public int mul() {
		return num1 * num2;
	}
	// return은 매서드를 사용한 곳에 돌려주는 것

	// 매서드명 div, 리턴타입o, 매개변수:정수 두 개, 실행문구 : 매개변수로 받은 두 변수를 나눈 값 리턴
	public double div(int a, int b) {
		return a / b;
	}
}














