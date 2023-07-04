package day01;

public class 타입_불리언 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 불리언은 true와 false 두 가지 값만 있음
		boolean a = true;
		boolean b = false;
		System.out.println(a); // true
		System.out.println(b); // false
	
		int aa = 10;
		int bb = 20;
		boolean c = aa > bb;
//		int c = aa > bb; // 값이 false이기에 int에 담을 수 없음
//		int c = aa > bb;
//		int d = aa < bb;
		
		
		System.out.println(c); // false	
		System.out.println(aa > bb); // false
	}

}
