package day10;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체생성
		Calculator c = new Calculator();
		c.num1 = 10;
		c.num2 = 5;

		c.Sum(); // 매개변수가 없음. 어떠한 값을 넘겨줄 필요가 없음
		c.sub(7, 2); // 매개변수가 두 개, 매개변수 두 개를 넘겨야 됨
		c.mul(); // 0과 0을 곱해서 리턴했음. 리턴값으로 아무것도 안해서 출력안됨
		System.out.println(c.mul()); // print에 넣어서 출력하면 됨
		c.div(10, 3);

		Calculator c1 = new Calculator();
		c1.num1 = 9;
		c1.num2 = 4;
		c1.Sum();
		c1.sub(7, 2);
		System.out.println(c1.mul());
		System.out.println(c1.div(10, 3));

	}

}
