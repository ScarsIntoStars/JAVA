package day09;

public class People {

	private String name; // 이름
	private int age; // 나이

	// 생성자

	// 기본생성자
	public People() {

	}

	// 전체필드를 다 받는 생성자
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 모든 필드 get/set 매서드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 모든 필드 출력하는 print매서드
	public void print() {
		System.out.println("이름\n나이");
		System.out.println("==========");
		System.out.printf("%s\t%d\n", name, age);
	}

	// 매서드명:ageUp, 매개변수 x, 리턴타입 x, 실행문구 age 1증가
	public void ageUp() {
		age++;
	}

	// 매서드명:ageUp1, 매개변수:정수하나, 리턴타입x 실행문구는 age를 매개
	// 실행문구는 age를 매개변수만큼 증가
	public void ageUp1(int a) {
		age = age + a;
	}
	
	public int koreanAge() {
		return age-2;
	}
	
	
}
