package day01;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 형변환
		int a = 10;
		double b = a; // 자동형변환
		System.out.println(b);
		
		double c = 3.14;
//		int d = c; // 불가능, int가 double보다 더 큼
		int d = (int)c; // 강제형변환
		System.out.println(d);
		
	}

}
