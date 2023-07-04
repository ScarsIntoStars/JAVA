package day09;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.setName("뽀삐");
		dog.setSound("멍멍");
		dog.setLeg(4);
		dog.print();
		dog.print1();
		// 객체이름 cat
		// 이름은 야옹이
		// 울음소리 야옹
		// 다리갯수 4게

		// 닭, 뱀

		Animal cat = new Animal();
//		cat.setName = "방울이"; // 양식이 맞지 않음
		cat.setName("야옹이");
		cat.setSound("야옹야옹");
		cat.setLeg(4);
		cat.print();
		cat.print1();
//		System.out.println(cat.getName() + "\t" + cat.getSound() + "\t" + cat.getLeg());
// 		Animal에 print 매서드를 만들어서 위처럼 간단하게 사용할 수 있음

		Animal snake = new Animal();
		snake.setName("뱀뱀이");
		snake.setSound("뱅뱅");
		snake.setLeg(0);
		snake.print();
		snake.print1();
//		System.out.println(snake.getName() + "\t" + snake.getSound() + "\t" + snake.getLeg());

	}

}
