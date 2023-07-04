package day08;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Calculator 객체 만들고
		// 모든 매서드 호출하여 더하기, 빼기, 곱하기, 나누기 출력(호출, 실행)
		
		Calculator c = new Calculator();
		c.num1 =5;
		c.num2 =3;
		c.sum();
		c.sub(7, 6); 
		System.out.println(c.mul());
		System.out.println(c.div(7, 3));
		
		
		
		
		
	}

}
