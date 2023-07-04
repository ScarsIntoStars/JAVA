package day04;

public class 이수정바보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 55;
		// 90이상 A
		// 100~95 A+ , 94~90 A

		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (score >= 80) { // 89~85 B+ , 84~80 B
			if(score>=85) {
				System.out.println("B+");
			} else {
				System.out.println("B");
			}
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}

//			if(score<70) {
//			System.out.println("F");
//		}

	}

}
