package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 20;
		// int a = 20; 을 하면 오류남, 변수가 중복되서
		// 콘솔에서 출력할 때 사용
		System.out.println(a);
		System.out.println(b);
		
		// '= 대입'
		// '== 같다(등호)'
		
		int c = a + b;
		System.out.println(c);
		
		int d = a;
		System.out.println(d);
		
		a = 20;
		b = 30;
		System.out.println(a + b);
		// 이게 왜 될까? => 덮어쓰기, '위에서 아래로, 좌에서 우로'
		// 새로운 값을 넣어서, 기존의 값이 사라진다.
		
		c = 100;
		System.out.println(c);
		
		c = a + b; 
		System.out.println(c); // 50
		// c가 덮힘 그래서 100이 아니라 50
		
//		z = 10;
//		System.out.println(z); // z를 타입으로 만들지 않아서 오류가 남
		
		int z = 10;
		System.out.println(z);
		
// 		int a = 10 // 여기서는 불가능, 위에서 변수로 만들어놔서.
		
		
		
		
		
		
	}


	
}
