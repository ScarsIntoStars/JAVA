package ex01;

public class Operation {

	public static void run() {
		// 산술연산자 ( + - * / % )
		int kor = 59;
		int eng = 58;
		int mat = 100;
		int sum = kor + eng + mat;
		double avg = sum / 3.; // 둘 중 하나만 형변환 하면 됨
//		double avg = sum / (double)3; // 점만 붙여도 실수로 인식

		System.out.printf("국어 : %d\n", +kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %.2f\n", avg);

		// 관계연산자 (>, >=, <, <=, ==, !=)

		// 삼항연산자
//		String pass = (avg >= 70) ? "합격" : "불합격"; // 좌 트루, 우 펄스
// 조건식 물음표 트루:펄스

//		System.out.println("결과 : " + pass);

		// 논리연산자 (&&, ||, !)
		String pass = (kor >= 60 && eng >= 60 && mat >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + pass);

		// 증감연산자 (++ --)
		int count = 0;
		if (kor < 60)
			count++;
//		명령어가 한 줄이면 중괄호 생략가능
		if (eng < 60)
			count++;

		if (mat < 60)
			count++;

		System.out.println("누락과목 수 : " + count + "개");

	}

}
