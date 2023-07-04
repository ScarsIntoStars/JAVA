package day09;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit apple = new Fruit();
		apple.name = "사과";
		apple.color = "빨강";
		apple.isSeed = true;

		apple.print();

		// 두 번째 생성자를 사용하여 melon객체 생성
		Fruit melon = new Fruit("멜론");
		melon.color = "green";
		melon.isSeed = false;
		melon.print();

		// 세 번째 생성자를 사용하여 orange객체 생성
		Fruit orange = new Fruit("orange", "led");
		
		orange.isSeed = true;
		orange.print();

		Fruit banana = new Fruit("바나나", "노랑", false);
		banana.print(); // 객체를 만들며 바로 입력할 수 있다.

	}

}
