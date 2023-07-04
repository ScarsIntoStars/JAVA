package day09;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Board객체 하나 만들기
		// cntUp매서드 사용하기
		// print매서드 사용하기
		Board a = new Board("자바는 즐거워", 100, true); // 기본생성자가 없는 상태
		a.cntUp();
		a.print();

		// Board객체 하나 만들기
		// cntUp1매서드 사용하고 리턴값 출력하기
		// print매서드 사용하기
		Board b = new Board("자바는 어려워", 20, false);
		System.out.println(b.cntUp1(5));
		b.print();
	}

}
