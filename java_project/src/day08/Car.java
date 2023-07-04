package day08;

public class Car {
	// 필드(인스턴스 변수) - 객체가 고유하게 가지고 있는 데이터
	String name;
	String tire;
	String color;
	int speed;

	// 생성자 - 객체를 생성할 때 사용하는 것

	// 메서드 - 객체의 기능을 표현하는 것 , 아래는 만드는 것 그리고 매서드를 사용하는 것은 호출이라고 함
	// 메서드 만드는 형식
	// 접근제한자(접근제어자) 리턴타입 매서드이름([매개변수]) {
	// 실행문구
	// }
	public void run() {
		speed = speed + 2; // 돌려받는 값 없음
	}

	public String getColor() {
		return color; // 겟컬러를 호출하면, 컬러를 돌려줌
	}

	public void speedRun(int speed) { // 호출하는 사람이 값을 입력함
		this.speed = this.speed + speed; // 
	}
	// 리턴타입이 int인 getSpeed매서드를 만드시오
	// 실행문구는 speed리턴
	
	public int getSpeed() {
		return speed;
	}
	
}
