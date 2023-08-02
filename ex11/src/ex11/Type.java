package ex11;

import java.util.Scanner;

public class Type {
	public static void run() {
		boolean run = true;
		TypeDAO tdao = new TypeDAO();
		CampDAO cdao = new CampDAO();
		FacilDAO fdao = new FacilDAO();
		Scanner s = new Scanner(System.in);

		while (run) {

			System.out.println("\n\n******* 건물타입관리 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1. 시설목록(타입) |2. 캠핑장 타입추가 |3. 캠핑장 타입삭제 |0.메뉴");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("메뉴로 돌아갑니다.");
				break;

			case "1":
				System.out.print("타입을 확인 할 시설번호를 입력하세요 > ");
				String findTypeCode = s.nextLine();
				if (findTypeCode == "") {
					System.out.println("타입 찾기를 취소하셨습니다");
				} else {
					if (tdao.search(findTypeCode) == null) {
						System.out.println("해당하는 번호의 캠핑장이 없습니다.");
						break;
					} else {

						System.out.println("캠핑장 이름 : " + cdao.read(findTypeCode));
						System.out.println("현재 캠핑장 타입 : " + fdao.list(findTypeCode));
						System.out.println("전체 캠핑장 타입 : " + fdao.list());
						System.out.print("추가 할 타입을 선택하세요 > ");
						String buildType = s.nextLine();
						if (buildType == "") {
							System.out.println("건설을 취소합니다.");
						} else {
							TypeVO tvo = new TypeVO();
							tvo.set
							tvo.setTno(Integer.parseInt(buildType));
							tdao.make(tvo);
						
						}
					}

				}

				break;

			case "2":

				break;

			case "3":

				break;

			default:

			} // 스위치
		} // 와일
	}
} // 매인 클래스
