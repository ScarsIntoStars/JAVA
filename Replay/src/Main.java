import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("6.상품별 매출조회 |7.판매등록 |8.매출현황 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			case "1":
				break;

			case "2":
				break;

			case "3":
				break;

			case "4":
				break;

			case "5":
				break;

			}
		}
	}
}
