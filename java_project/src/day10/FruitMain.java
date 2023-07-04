package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit apple = new Fruit(); // 1번 생성자 사용
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;

		// 두번째 생성자를 사용하여 바나나 객체생성
		Fruit banana = new Fruit("바나나"); // 2번 생성자 사용
		banana.color = "노랑";
		banana.isSeed = true;

		// 세번째 생성자를 사용하여 멜론 객체생성
		Fruit melon = new Fruit("멜론", "초록"); // 3번 생성자 사용
		melon.isSeed = true;

		// 네번째 생성자를 사용하여 오랜지 객체생성
		Fruit orange = new Fruit("오랜지", "주황", true); // 4번 생성자 사용

		apple.print();
		banana.print();
		melon.print();
		orange.print();
	}

}
