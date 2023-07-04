package day09;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "홍길동";
		String b = new String("홍길동");

		Calculator c = new Calculator();
		c.num1 = 1;
		c.num2 = 9;

		c.sum();
		c.sub(7, 5);
		System.out.println(c.mul());
		System.out.println(c.div(7, 9));

		Calculator c1 = new Calculator();
		System.out.println(c1.num1);
	}

}
