package day02;

public class 반목문_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 반복문은 조건이 맞지 않거나 break를 만나면 반복문을 빠져나옴
//		for(int i=1; i<10; i++) {
//			System.out.println(i);
//			if(i == 4) {
//				break;
//			}
//		}
//		
		
		// continue는 만나면 아래있는 반복문을 건너뜀
//		for(int i=1; i<=10; i++) {
//			if(i == 4) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		
		//
		int dan = 7;
		
		// 출력예시)
		// 7 * 1 = 7
		// 7 * 2 = 14
		// 7 * 3 = 21
		// 7 * 4 = 28
		// 
		// 7 * 6 = 42
		// 7 * 7 = 49
		// 7 * 8 = 56
		// 
		
		for(int i=1; i<=15; i++) {
			if(i == 5) {
				System.out.println();
				continue;
			} else if(i == 9) {
				break;
			}
			System.out.println(dan + " * " + i + " = " + (i*dan));
		} 
		
	}

}



