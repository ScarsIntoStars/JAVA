package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 3;
		// 들여쓰기는 tap. 기본 중 기본.
		
		
		// 산술연산자
		System.out.println(a + b); // 더하기
		System.out.println(a - b); // 빼기
		System.out.println(a * b); // 곱하기
		System.out.println(a / b); // 나누기
		System.out.println(a % b); // 나눈 후 나머지
		System.out.println("====================");
		
		
		// 비교연산자 (true , false)
		System.out.println(a > b); // 큰 지(초과)
		System.out.println(a < b); // 작은 지(미만)
		System.out.println(a >= b); // 크거나 같은지(이상)
		System.out.println(a <= b); // 작거나 같은지(이하)
		System.out.println(a == b); // 같은지
		System.out.println(a != b); // 같지 않은지
		System.out.println("===================");
		
		a = 10;
		b = 10;
		int c = 9;
		
		
		// 논리연산자
//		&& (and 그리고 둘 다 맞아야 참)
//		|| (or 또는 둘 중 하나만 맞아도 참), 버티컬 바
//		! (not) 논리부정
		System.out.println(a > b && b > c); // false
		System.out.println(a > c && c > b); // false
		System.out.println(a > b && a > c); // false
		System.out.println(c > a || a >= b); // true
		System.out.println(a != b || a == b); // true
		System.out.println(!(a > c)); // false
		System.out.println(!(a > b && b > c)); // true
		System.out.println(a > b && !(b > c)); // false
		

	}

}
