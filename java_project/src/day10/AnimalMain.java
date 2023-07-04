package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal dog = new Animal();
		Animal cat = new Animal();
		Animal chicken = new Animal();
		Animal snake = new Animal();

//		dog.name = "강아지";
//		dog.sound = "멍멍";
//		dog.leg = 4;
//		System.out.println(dog.name);

		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName());
		System.out.println(dog.getName() + "\t" + dog.getSound() + "\t" + dog.getLeg());
		// cat, chicken, snake객체 만들어서
		// 값 세팅하기

		// cat
		cat.setName("나비");
		cat.setSound("야옹야옹");
		cat.setLeg(4);
		System.out.println(cat.getName() + "\t" + cat.getSound() + "\t" + cat.getLeg());

		// chicken
		chicken.setName("닭");
		chicken.setSound("꼬꼬");
		chicken.setLeg(2);
		System.out.println(chicken.getName() + "\t" + chicken.getSound() + "\t" + chicken.getLeg());

		// snake
		snake.setName("뱀뱀");
		snake.setSound("크르릉");
	}

}
