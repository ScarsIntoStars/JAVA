package day10;

public class Fruit {

	String name;
	String color;
	boolean isSeed;

// [생성자의 특징]
// 1. 클래스의 이름과 같음
// 2. 리턴 타입이 없음

// 생성자 선언방식
// 접근제한자 생성ㅈ아명([매개변수]) {
// 실행문구(보통의 경우 필드값을 초기화한다.)
// }

// 	내가 안만들었지만, 자동으로 만들어진 생성자
	public Fruit() {

	}

	public Fruit(String name) {
		this.name = name;
	}

	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public Fruit(String name, String color, boolean isSeed) {
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}

	// 매서드
	public void print() {
		System.out.println(name + "\t" + color + "\t" + isSeed);
	}

}
