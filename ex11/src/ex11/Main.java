package ex11;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		CampDAO cdao = new CampDAO();
		boolean run = true;
		Scanner s = new Scanner(System.in);
		while (run) {
			System.out.println("\n\n******* 캠핑장관리 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1. 캠핑장 목록 |2. 캠핑장 조회 |3. 캠핑장 정보수정 |0.종료");
			System.out.println("4. 캠핑장 시설물 관리 |5. 캠핑장 건물관리 |6. 캠핑장 등록");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			case "1":
				List<CampVO> array = cdao.list();
				for (CampVO vo : array) {
					System.out.printf("%-5s\t%-10s\t%-22s\t%s\n", vo.getCno(), vo.getCname(), vo.getJuso(),
							vo.getTel());
				}
				System.out.println(array.size() + "개의 캠핑장이 있습니다.");
				break;

			case "2": // 캠핑장 조회
				while (true) {
					System.out.print("\n찾고자 하는 캠핑장 번호 > ");
					String findCampNo = s.nextLine();
					if (findCampNo == "") {
						System.out.println("캠핑장 찾기를 취소합니다.");
						break;
					} else {
						CampVO cvo = cdao.read(findCampNo);
						if (cvo.getCname() == null) {
							System.out.println("해당 캠핑장이 존재하지 않습니다.");
						} else {
							System.out.println("캠핑장 이름 : " + cvo.getCname());
							System.out.println("캠핑장 주소 : " + cvo.getJuso());
							System.out.println("캠핑장 전화 : " + cvo.getTel());
							break;
						}
					}

				}
				break;

			case "3":
				while (true) {
					System.out.print("수정할 캠핑장 번호 > ");
					String findCampCode = s.nextLine();
					if (findCampCode == "") {
						System.out.println("수정을 취소합니다.");
						break;
					} else {
						CampVO cvo = cdao.read(findCampCode);
						if (cvo.getCname() == null) {
							System.out.println("캠핑장이 존재하지 않습니다.");
							break;
						} else { // 수정할 캠핑장이 있으면
							System.out.println("기존 캠핑장 이름 : " + cvo.getCname());
							System.out.print("새로운 캠핑장 이름 > ");
							String newCampName = s.nextLine();
							if (newCampName != "")
								cvo.setCname(newCampName);

							System.out.println("캠핑장 주소 : " + cvo.getJuso());
							System.out.print("새로운 캠핑장 주소 > ");
							String newCampJuso = s.nextLine();
							if (newCampJuso != "")
								cvo.setJuso(newCampJuso);

							System.out.println("캠핑장 전화 : " + cvo.getTel());
							System.out.print("새로운 캠핑장 전화 > ");
							String newCampTel = s.nextLine();
							if (newCampTel != "")
								cvo.setTel(newCampTel);

							System.out.println("수정하실래요? (Y/y)");
							String sel = s.nextLine();
							if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
								System.out.println("캠핑장 수정완료!");
								cdao.update(cvo);
								break;
							} else {
								System.out.println("수정을 취소하였습니다.");
								break;
							}
						}
					}
				}

				break;

			case "4":
				Facil.run();
				break;
				
			case "5":
				Type.run();
				break;

			case "6":
				CampVO cvo = new CampVO();
				cvo.setCno(cdao.getNo());
				System.out.println("새로운 번호 > " + cvo.getCno());
				System.out.print("캠핑장 이름 > ");
				String cname = s.nextLine();
				if (cname.equals("")) {
					System.out.println("등록을 취소합니다.");
				} else {
					System.out.print("캠핑장 주소 > ");
					String juso = s.nextLine();
					System.out.print("캠핑장 전화 > ");
					String tel = s.nextLine();
					cvo.setCname(cname);
					cvo.setJuso(juso);
					cvo.setTel(tel);
//					System.out.println(cvo.toString());
					cdao.insert(cvo);
					System.out.println("신규 캠핑장이 오픈하였습니다! 만관부~~ 만관부~~");
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!");
			} // 스위치
		} // 와일
	} // 매인매서드
} // 매인클래스
